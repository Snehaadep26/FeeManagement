package com.example.fee_management_new.Api;

public class GeneratePaymentForIndividualResponse {
    public ShowGenerateInd show;

    public GeneratePaymentForIndividualResponse(ShowGenerateInd show) {
        this.show = show;
    }

    public ShowGenerateInd getShow() {
        return show;
    }
}

