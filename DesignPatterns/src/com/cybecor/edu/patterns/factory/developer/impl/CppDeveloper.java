package com.cybecor.edu.patterns.factory.developer.impl;

import com.cybecor.edu.patterns.factory.developer.Developer;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer write c++ code!!!");
    }
}
