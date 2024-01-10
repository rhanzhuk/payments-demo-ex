package com.rnganzhuk.payment_demo_ex.controller;

import com.rnganzhuk.payment_demo_ex.entity.Payment;
import com.rnganzhuk.payment_demo_ex.repository.PaymentStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PaymentController {
    @Autowired
    PaymentStore paymentStore;

    @GetMapping(path = "/api/v1/payments/{id}")
    public @ResponseBody Optional<Payment> getPayment(@PathVariable(value = "id") int id){
        return Optional.of(paymentStore.getPayment(id));
    }

    @PostMapping(path = "/api/v1/payments")
    public void addPayment(@RequestBody Payment payment){
        paymentStore.addPayment(payment);
    }

    @GetMapping(path = "/api/v1/payments")
    public @ResponseBody List<Payment> getAllPayment(){
        return  paymentStore.getPayments();
    }

    @DeleteMapping(path = "/api/v1/payments/{id}")
    public boolean rmPayment(@PathVariable(value = "id") int id){
        boolean result = paymentStore.deletePayment(id);
        return result;
    }

}
