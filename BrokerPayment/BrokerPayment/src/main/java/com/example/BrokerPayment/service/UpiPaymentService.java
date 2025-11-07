package com.example.BrokerPayment.service;


import com.example.BrokerPayment.entity.UpiPayment;
import com.example.BrokerPayment.repository.UpiPaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UpiPaymentService {

    private final UpiPaymentRepository upiPaymentRepository;

    public UpiPaymentService(UpiPaymentRepository upiPaymentRepository) {
        this.upiPaymentRepository = upiPaymentRepository;
    }

    public UpiPayment saveUpiPayment(UpiPayment payment) {
        return upiPaymentRepository.save(payment);
    }

    public List<UpiPayment> getAllUpiPayments() {
        return upiPaymentRepository.findAll();
    }
}

