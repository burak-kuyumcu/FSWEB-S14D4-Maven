package org.example.model;

public class Store {

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }

    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Dark Chocolate", 45.5, "Bitter chocolate", "70%");
        products[1] = new Coke("Zero Coke", 30.0, "Sugar free coke", 1.0);
        products[2] = new Bread("Whole Wheat Bread", 20.0, "Healthy bread", 400);

        listProducts(products);
    }
}