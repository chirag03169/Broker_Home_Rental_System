package com.example.BrokerPayment.repository;

import com.example.BrokerPayment.entity.UpiPayment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UpiPaymentRepository extends JpaRepository<UpiPayment, Long> {
}
