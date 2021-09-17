package com.bluesoft.solid.openclosedprinciple.goodexample;

import org.junit.jupiter.api.Test;

class ClaimApprovalManagerTest {

    @Test
    void processClaim() {
        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        ClaimApprovalManager manager1 = new ClaimApprovalManager();
        manager1.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        manager1.processClaim(vehicleInsuranceSurveyor);
    }
}