package com.cybecor.edu.patterns.factory.developerFactory.impl;

import com.cybecor.edu.patterns.factory.developer.Developer;
import com.cybecor.edu.patterns.factory.developer.impl.JavaDeveloper;
import com.cybecor.edu.patterns.factory.developerFactory.DeveloperFactory;

public class JavaDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
