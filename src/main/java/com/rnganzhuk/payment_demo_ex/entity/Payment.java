package com.rnganzhuk.payment_demo_ex.entity;

import org.springframework.stereotype.Service;

@Service
public class Payment {

    private int id;
    private String sender;
    private String receiver;

    public Payment(){}

    public Payment(int id, String sender, String receiver){
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString(){
        return "Payment{" +
                "id=" + id +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
