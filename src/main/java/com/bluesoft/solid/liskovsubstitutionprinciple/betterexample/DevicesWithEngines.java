package com.bluesoft.solid.liskovsubstitutionprinciple.betterexample;

class DevicesWithEngines extends TrasportationDevice {
  private final Engine engine;

    DevicesWithEngines(final Engine engine) {
        this.engine = engine;
    }

    void startEngine(){}
}

class Engine{

}
