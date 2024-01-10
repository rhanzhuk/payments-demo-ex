package com.rnganzhuk.payment_demo_ex.repository;

import com.rnganzhuk.payment_demo_ex.entity.Payment;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PaymentStore {

    private List<Payment> payments;

    public PaymentStore(){
        this.payments = new ArrayList<>();

        payments.add(new Payment(1, "Sender1", "Receiver1"));
        payments.add(new Payment(2, "Sender2", "Receiver2"));
        payments.add(new Payment(3, "Sender3", "Receiver3"));
    }

    public List<Payment> getPayments(){
        return payments;
    }

    public void addPayment(Payment payment){
        payments.add(payment);
    }

    public Payment getPayment(int id){
        for (int i = 0; i < payments.size(); i++){
            Payment tmpPay = payments.get(i);
            if(tmpPay.getId() == id){
                return tmpPay;
            }
        }
        return null;
    }

    public boolean deletePayment(int id){
        Payment payment = getPayment(id);
        boolean res = false;
        if (payment != null){
            res = payments.remove(payment);
        }
        return res;
    }
}
