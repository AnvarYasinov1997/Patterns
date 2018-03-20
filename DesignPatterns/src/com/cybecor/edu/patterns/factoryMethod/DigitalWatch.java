package com.cybecor.edu.patterns.factoryMethod;

import java.util.Date;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(new Date(System.currentTimeMillis()));
    }
}
