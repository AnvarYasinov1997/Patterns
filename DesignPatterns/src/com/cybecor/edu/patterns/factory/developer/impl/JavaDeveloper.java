package com.cybecor.edu.patterns.factory.developer.impl;

import com.cybecor.edu.patterns.factory.developer.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write java code!!!");
    }
}
