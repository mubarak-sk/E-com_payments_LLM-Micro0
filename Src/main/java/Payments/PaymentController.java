package com.wcom.payment;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @PostMapping
    public String processPayment(@RequestParam double amount) {
        // Dummy logic
        return "Payment of ₹" + amount + " processed successfully!";
    }

    @GetMapping("/status")
    public String status() {
        return "Payment service is running!";
    }
}
