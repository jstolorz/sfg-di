package com.bluesoft.solid.liskovsubstitutionprinciple.betterexample;

class TrasportationDevice {
    private String name;
    private double speed;

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
}
