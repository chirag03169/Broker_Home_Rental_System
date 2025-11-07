package com.example.BrokerPayment.service;
import com.example.BrokerPayment.entity.CardPayment;
import com.example.BrokerPayment.repository.CardPaymentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardPaymentService {

    private final CardPaymentRepository cardPaymentRepository;

    public CardPaymentService(CardPaymentRepository cardPaymentRepository) {
        this.cardPaymentRepository = cardPaymentRepository;
    }

    public CardPayment saveCardPayment(CardPayment payment) {
        return cardPaymentRepository.save(payment);
    }

    public List<CardPayment> getAllCardPayments() {
        return cardPaymentRepository.findAll();
    }
}

