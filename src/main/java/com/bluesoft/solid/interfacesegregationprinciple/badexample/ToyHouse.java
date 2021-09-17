package com.bluesoft.solid.interfacesegregationprinciple.badexample;

class ToyHouse implements Toy {
    @Override
    public void setPrice(final double price) {

    }

    @Override
    public void setColor(final String color) {

    }

    // -- This is a violation of the Interface Segregation Principle
    @Override
    public void move() {

    }

    @Override
    public void fly() {

    }
    // --
}
