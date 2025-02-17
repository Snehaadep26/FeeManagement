package com.example.fee_management_new.Api;

import java.util.ArrayList;
import java.util.List;

public class GeneratePaymentForIndividualRequest {
    public int amount;
    public String note;
    public String paymentType;
    public Object paymentMethod;
    public String discountDetails;
    public Object additionDetails;
    public String dueDate;
    public List<Integer> userIds;
    public int standardId;

    public GeneratePaymentForIndividualRequest(int amount, String note, String paymentType, Object paymentMethod, String discountDetails, Object additionDetails, String dueDate, List<Integer> userIds, int standardId) {
        this.amount = amount;
        this.note = note;
        this.paymentType = paymentType;
        this.paymentMethod = paymentMethod;
        this.discountDetails = discountDetails;
        this.additionDetails = additionDetails;
        this.dueDate = dueDate;
        this.userIds = userIds;
        this.standardId = standardId;
    }

    public int getAmount() {
        return amount;
    }

    public String getNote() {
        return note;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public Object getPaymentMethod() {
        return paymentMethod;
    }

    public String getDiscountDetails() {
        return discountDetails;
    }

    public Object getAdditionDetails() {
        return additionDetails;
    }

    public String getDueDate() {
        return dueDate;
    }

    public List<Integer> getUserIds() {
        return userIds;
    }

    public int getStandardId() {
        return standardId;
    }
}


