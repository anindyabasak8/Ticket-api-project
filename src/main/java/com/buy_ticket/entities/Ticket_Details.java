package com.buy_ticket.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Ticket_Details {
	
	@Id
	private String pnrNumber;
	private String custName;
	private String dest;
	private String paymentStatus;
	private String bookingStatus;
	private long amount;
}
