package com.cybecor.edu.patterns;

import com.cybecor.edu.patterns.composite.*;

public class Main {

    public static void main(String[] args) {

        ProductBox box = new ProductBox();
        ProductBox bigBox = new ProductBox();

        Product apple = new Apple();
        Product banana = new Banana();

        Product orange = new Orange();

        box.add(apple);
        box.add(banana);

        System.out.println(box.getPrice());


        bigBox.add(box);
        bigBox.add(orange);
        System.out.println(bigBox.getPrice());
    }
}
