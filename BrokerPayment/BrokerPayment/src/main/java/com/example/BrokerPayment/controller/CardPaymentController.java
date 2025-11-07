package com.example.BrokerPayment.controller;

import com.example.BrokerPayment.entity.CardPayment;
import com.example.BrokerPayment.service.CardPaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/card-payments")
@CrossOrigin(origins = "*")
public class CardPaymentController {

    private final CardPaymentService cardPaymentService;

    public CardPaymentController(CardPaymentService cardPaymentService) {
        this.cardPaymentService = cardPaymentService;
    }

    @PostMapping
    public ResponseEntity<CardPayment> createCardPayment(@Valid @RequestBody CardPayment payment) {
        CardPayment saved = cardPaymentService.saveCardPayment(payment);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<CardPayment>> getCardPayments() {
        return ResponseEntity.ok(cardPaymentService.getAllCardPayments());
    }
}
