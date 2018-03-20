package com.cybecor.edu.patterns.factory.developerFactory;

import com.cybecor.edu.patterns.factory.developerFactory.impl.CppDeveloperFactory;
import com.cybecor.edu.patterns.factory.developerFactory.impl.JavaDeveloperFactory;
import com.cybecor.edu.patterns.factory.developerFactory.impl.KotlinDeveloperFactory;

public final class AbstractFactory {
    public static DeveloperFactory create(String developer) throws Exception {
        switch (developer) {
            case "Java":
                return new JavaDeveloperFactory();
            case "Kotlin":
                return new KotlinDeveloperFactory();
            case "C++":
                return new CppDeveloperFactory();
        }
        throw new Exception("Developer not found");
    }
}