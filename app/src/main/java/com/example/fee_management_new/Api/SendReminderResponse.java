package com.example.fee_management_new.Api;

public class SendReminderResponse {
    public ShowSendRemin show;

    public SendReminderResponse(ShowSendRemin show) {
        this.show = show;
    }

    public ShowSendRemin getShow() {
        return show;
    }
}

