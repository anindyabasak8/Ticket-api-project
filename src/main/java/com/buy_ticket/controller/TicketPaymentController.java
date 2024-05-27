package com.buy_ticket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.buy_ticket.entities.Ticket_Details;
import com.buy_ticket.responses.Request;
import com.buy_ticket.service.TicketPaymentService;
import com.buy_ticket.ticket_exception.Ticket_exception;

@RestController
public class TicketPaymentController {

	@Autowired
	public TicketPaymentService tps;
	

	@PostMapping("/book_ticket")
	public String bookTicket(@RequestBody Request rq) throws Exception {
		 tps.bookTicket(rq);
		 return "Data saved";
	}
	
}
