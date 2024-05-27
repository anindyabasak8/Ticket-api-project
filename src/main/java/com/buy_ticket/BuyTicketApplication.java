package com.buy_ticket;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import org.slf4j.*;

@EnableTransactionManagement
@SpringBootApplication
public class BuyTicketApplication {
	
	public static Logger logger 
    = LoggerFactory.getLogger(BuyTicketApplication.class); 

	public static void main(String[] args) {
		logger.info("Application started.."); 
		logger.info("New logger added..");//New commit
		SpringApplication.run(BuyTicketApplication.class, args);//hello
	}

}
