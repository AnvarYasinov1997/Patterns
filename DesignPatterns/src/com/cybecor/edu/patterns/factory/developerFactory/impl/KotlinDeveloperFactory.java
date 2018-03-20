package com.cybecor.edu.patterns.factory.developerFactory.impl;

import com.cybecor.edu.patterns.factory.developer.Developer;
import com.cybecor.edu.patterns.factory.developer.impl.KotlinDeveloper;
import com.cybecor.edu.patterns.factory.developerFactory.DeveloperFactory;

public class KotlinDeveloperFactory implements DeveloperFactory {

    @Override
    public Developer getDeveloper() {
        return new KotlinDeveloper();
    }
}
