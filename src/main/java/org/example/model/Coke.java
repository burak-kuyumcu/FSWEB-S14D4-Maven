package org.example.model;

public class Coke extends ProductForSale {
    private double liter;

    public Coke(String type, double price, String description) {
        super(type, price, description);
        this.liter = 1.0;
    }

    public Coke(String type, double price, String description, double liter) {
        super(type, price, description);
        this.liter = liter;
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Liter: " + liter);
    }
}