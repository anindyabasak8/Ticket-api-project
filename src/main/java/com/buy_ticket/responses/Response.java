package com.buy_ticket.responses;

import org.springframework.stereotype.Component;

import com.buy_ticket.entities.Customer_Details;
import com.buy_ticket.entities.Ticket_Details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class Response {
	public Ticket_Details td;
}
