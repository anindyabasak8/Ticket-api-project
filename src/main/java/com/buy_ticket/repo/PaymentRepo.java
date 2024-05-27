package com.buy_ticket.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buy_ticket.entities.Payment_Details;

public interface PaymentRepo extends JpaRepository<Payment_Details, Integer>{

}
