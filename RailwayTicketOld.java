package com.example.firstproject;
import com.example.firstproject.RailwayTicket;

public class RailwayTicketOld {
    private float ticketDiscount;

    public RailwayTicketOld() {
    }

    public RailwayTicketOld(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }


    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100;
    }
}
