package com.bluesoft.solid.liskovsubstitutionprinciple.badexample;

class Bicycle extends TrasportationDevice {
    @Override
    void startEngine() {
        /*violation of Liskov Substitution Principle*/
    }
}
