package com.bluesoft.solid.liskovsubstitutionprinciple.badexample;

class TrasportationDevice {
    private String name;
    private double speed;

    /*violation of Liskov Substitution Principle*/
    private Engine engine;

    String getName() {
        return name;
    }

    void setName(final String name) {
        this.name = name;
    }

    double getSpeed() {
        return speed;
    }

    void setSpeed(final double speed) {
        this.speed = speed;
    }

    Engine getEngine() {
        return engine;
    }

    void setEngine(final Engine engine) {
        this.engine = engine;
    }
    
    void startEngine(){}
}

class Engine{
    
}
