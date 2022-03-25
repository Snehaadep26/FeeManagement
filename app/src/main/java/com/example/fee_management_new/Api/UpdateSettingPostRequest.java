package com.example.fee_management_new.Api;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class UpdateSettingPostRequest {
    public String transactionPaidBy;

    public UpdateSettingPostRequest(String transactionPaidBy) {
        this.transactionPaidBy = transactionPaidBy;
    }

    public String getTransactionPaidBy() {
        return transactionPaidBy;
    }
}


