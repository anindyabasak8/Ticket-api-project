package com.buy_ticket.responses;

import com.buy_ticket.entities.Customer_Details;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {
	public Customer_Details customer;
}
