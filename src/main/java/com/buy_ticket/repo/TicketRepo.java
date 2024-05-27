package com.buy_ticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy_ticket.entities.Ticket_Details;

public interface TicketRepo extends JpaRepository<Ticket_Details, String>{

}
