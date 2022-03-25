package com.example.fee_management_new.Api;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class UpdateOfflineTransactionRequest {
    public int transactionId;
    public String paymentMethod;
    public String chequeNo;

    public UpdateOfflineTransactionRequest(int transactionId, String paymentMethod, String chequeNo) {
        this.transactionId = transactionId;
        this.paymentMethod = paymentMethod;
        this.chequeNo = chequeNo;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getChequeNo() {
        return chequeNo;
    }
}

