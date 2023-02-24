package com.example.firstproject;
import com.example.firstproject.RailwayTicket;
public class RailwayTicketChild extends RailwayTicket {
   
    private float ticketDiscount;

    
    public RailwayTicketChild() {
    }
    
    public RailwayTicketChild(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount))/100; 
}
