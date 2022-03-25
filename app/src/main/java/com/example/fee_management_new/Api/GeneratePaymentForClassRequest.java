package com.example.fee_management_new.Api;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class GeneratePaymentForClassRequest {
    public int standardId;
    public String dueDate;
    public int amount;
    public String gst;
    public String note;

    public GeneratePaymentForClassRequest(int standardId, String dueDate, int amount, String gst, String note) {
        this.standardId = standardId;
        this.dueDate = dueDate;
        this.amount = amount;
        this.gst = gst;
        this.note = note;
    }

    public int getStandardId() {
        return standardId;
    }

    public String getDueDate() {
        return dueDate;
    }

    public int getAmount() {
        return amount;
    }

    public String getGst() {
        return gst;
    }

    public String getNote() {
        return note;
    }
}

