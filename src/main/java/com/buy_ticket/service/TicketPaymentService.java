package com.buy_ticket.service;

import java.util.Random;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buy_ticket.entities.Customer_Details;
import com.buy_ticket.entities.Dest_limit;
import com.buy_ticket.entities.Payment_Details;
import com.buy_ticket.entities.Ticket_Details;
import com.buy_ticket.repo.CustRepo;
import com.buy_ticket.repo.TicketRepo;
import com.buy_ticket.responses.Request;
import com.buy_ticket.responses.Response;
import com.buy_ticket.ticket_exception.Ticket_exception;


@Service
public class TicketPaymentService {
	
	@Autowired
	public CustRepo repo;
	
	@Autowired
	public TicketRepo trepo;
	
	@Autowired
	public Response resp;
	
	@Transactional(rollbackFor = Ticket_exception.class)
	public Ticket_Details bookTicket(Request req) throws Exception {
		String bookingStaus = null;
		String pnrNo = "Not Available";
		String paymentStatus = new Random().nextBoolean() ? "Success" : "Failed";
		if (paymentStatus.equalsIgnoreCase("Success")) {
			bookingStaus = new Random().nextBoolean() ? "Confirm" : "Rac";
			pnrNo = UUID.randomUUID().toString();
		} else {
			bookingStaus = "Not booked";
		}

		Payment_Details ob = new Payment_Details();
		ob.setBookingStatus(bookingStaus);
		ob.setPaymentStatus(paymentStatus);
		ob.setPnrNo(pnrNo);
		ob.setAmount(req.getCustomer().getPd().getAmount());
		req.getCustomer().setPd(ob);
		repo.save(req.getCustomer());
		
		
			//Generating ticket details and validating the destination
			Ticket_Details td = new Ticket_Details();
			td.setAmount(req.getCustomer().getPd().getAmount());
			td.setBookingStatus(ob.getBookingStatus());
			td.setCustName(req.getCustomer().getName());
			td.setDest(req.getCustomer().getDest());
			td.setPaymentStatus(ob.getPaymentStatus());
			td.setPnrNumber(ob.getPnrNo());
			
			Dest_limit.destValidation(td.getDest());
			
		return trepo.save(td);

	}
	
	
	
	
}
