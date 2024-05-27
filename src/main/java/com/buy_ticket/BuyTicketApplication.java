package com.buy_ticket;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class BuyTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyTicketApplication.class, args);
	}

}
