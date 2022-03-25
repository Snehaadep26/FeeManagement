package com.example.fee_management_new.Api;

public class DeleteRequestResponse {
    public ShowDeleteReq show;

    public DeleteRequestResponse(ShowDeleteReq show) {
        this.show = show;
    }

    public ShowDeleteReq getShow() {
        return show;
    }
}


