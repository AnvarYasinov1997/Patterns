package com.cybecor.edu.patterns.factoryMethod;

public final class WatchFactory {
    public static Watch create(String className) throws Exception {
        switch (className.toLowerCase()) {
            case "rome":
                return new RomeWatch();
            case "digital":
                return new DigitalWatch();
        }
        throw new Exception("Watch not found...");
    }
}
