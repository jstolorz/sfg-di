package com.bluesoft.solid.liskovsubstitutionprinciple.betterexample;

class Car extends DevicesWithEngines {
    Car(final Engine engine) {
        super(engine);
    }

    @Override
    void startEngine() {
    }
}
