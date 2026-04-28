package org.example.model;

public class Chocolate extends ProductForSale {
    private String cocoaRate;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
        this.cocoaRate = "70%";
    }

    public Chocolate(String type, double price, String description, String cocoaRate) {
        super(type, price, description);
        this.cocoaRate = cocoaRate;
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Cocoa Rate: " + cocoaRate);
    }
}