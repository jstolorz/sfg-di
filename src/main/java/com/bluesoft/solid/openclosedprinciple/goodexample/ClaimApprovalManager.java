package com.bluesoft.solid.openclosedprinciple.goodexample;

public class ClaimApprovalManager {

    public void processClaim(InsuranceSurveyor surveyor){
        if (surveyor.isValidClaim()){
            System.out.println("ClaimApprovalManager: Valid claim. Currently processing claim for approval....");
        }
    }

}
