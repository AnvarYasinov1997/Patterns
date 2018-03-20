package com.cybecor.edu.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class ProductBox implements Product {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        if (product == this) return;
        products.add(product);
    }

    public void delete(Product product) {
        products.remove(product);
    }

    @Override
    public double getPrice() {
        double price = 0;
        for (Product product : products) {
            price += product.getPrice();
        }
        return price;
    }
}