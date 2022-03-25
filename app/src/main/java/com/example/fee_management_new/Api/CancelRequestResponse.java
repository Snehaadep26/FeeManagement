package com.example.fee_management_new.Api;

public class CancelRequestResponse {
    public ShowCancelReq show;

    public CancelRequestResponse(ShowCancelReq show) {
        this.show = show;
    }

    public ShowCancelReq getShow() {
        return show;
    }
}

