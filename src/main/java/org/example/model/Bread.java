package org.example.model;

public class Bread extends ProductForSale {
    private int gram;

    public Bread(String type, double price, String description) {
        super(type, price, description);
        this.gram = 400;
    }

    public Bread(String type, double price, String description, int gram) {
        super(type, price, description);
        this.gram = gram;
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType());
        System.out.println("Price: " + getPrice());
        System.out.println("Description: " + getDescription());
        System.out.println("Gram: " + gram);
    }
}