package com.buy_ticket.entities;

import com.buy_ticket.ticket_exception.Ticket_exception;

public class Dest_limit {
	public static final String [] DESTINATION_LIMIT = {"Mumbai","Sri Lanka","Maldives"};
	
	public static void destValidation(String dest) throws Ticket_exception {
		for(String destNotAllowed: Dest_limit.DESTINATION_LIMIT) {
			if(destNotAllowed.equalsIgnoreCase(dest)) {
				throw new Ticket_exception("Destination: "+destNotAllowed+" is currently not Allowed");
			}
		}
	}
}
