package com.example.fee_management_new.Api;

public class UpdateOfflineTransactionResponse {
    public ShowUpdateOff show;

    public UpdateOfflineTransactionResponse(ShowUpdateOff show) {
        this.show = show;
    }

    public ShowUpdateOff getShow() {
        return show;
    }
}

