package com.bluesoft.solid.openclosedprinciple.goodexample;

class VehicleInsuranceSurveyor implements InsuranceSurveyor {
    @Override
    public boolean isValidClaim() {
        System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
        return true;
    }
}
