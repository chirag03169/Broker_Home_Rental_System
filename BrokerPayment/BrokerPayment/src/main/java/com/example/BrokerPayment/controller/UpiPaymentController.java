package com.example.BrokerPayment.controller;
import com.example.BrokerPayment.entity.UpiPayment;
import com.example.BrokerPayment.service.UpiPaymentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/upi-payments")
@CrossOrigin(origins = "*")
public class UpiPaymentController {

    private final UpiPaymentService upiPaymentService;

    public UpiPaymentController(UpiPaymentService upiPaymentService) {
        this.upiPaymentService = upiPaymentService;
    }

    @PostMapping
    public ResponseEntity<UpiPayment> createUpiPayment(@Valid @RequestBody UpiPayment payment) {
        UpiPayment saved = upiPaymentService.saveUpiPayment(payment);
        return ResponseEntity.ok(saved);
    }

    @GetMapping
    public ResponseEntity<List<UpiPayment>> getUpiPayments() {
        return ResponseEntity.ok(upiPaymentService.getAllUpiPayments());
    }
}
