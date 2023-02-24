package com.example.firstproject;

public class RailwayTicket {
    
    private String departurePoint; 
    private String arrivalPoint; 
    private String departureDate; 
    private String arrivalDate; 
    private String travelTime; 
    private int distance; 
    private float ticketPrice; 
    private int numberOfTickets;

    
    public RailwayTicket() {
    }
    public RailwayTicket(float ticketPrice, int numberOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }
    public float ticketPriceAll() {
        return ticketPrice * numberOfTickets; 
    }
    public float getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public int getNumberOfTickets() {
        return numberOfTickets;
    }
    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }
}
