package com.buy_ticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy_ticket.entities.Customer_Details;

public interface CustRepo extends JpaRepository<Customer_Details, Integer>{

}
