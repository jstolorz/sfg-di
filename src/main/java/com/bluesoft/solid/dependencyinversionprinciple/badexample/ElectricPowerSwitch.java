package com.bluesoft.solid.dependencyinversionprinciple.badexample;

class ElectricPowerSwitch {

    // violating of the principle
    public LightBulb lightBulb;
    public boolean on;

    ElectricPowerSwitch(final LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.on = false;
    }

    public boolean isOn(){
        return this.on;
    }

    public void press(){
        boolean checkOn = isOn();
        if(checkOn){
            lightBulb.turnOff();
            this.on = false;
        }else{
            lightBulb.turnOn();
            this.on = true;
        }
    }
}
