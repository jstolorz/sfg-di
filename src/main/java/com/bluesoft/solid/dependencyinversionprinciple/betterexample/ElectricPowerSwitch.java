package com.bluesoft.solid.dependencyinversionprinciple.betterexample;

class ElectricPowerSwitch implements Switch {

    private final Switchable client;
    private boolean on;

    ElectricPowerSwitch(final Switchable client) {
        this.client = client;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }
    }
}
