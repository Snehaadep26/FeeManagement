package com.example.fee_management_new.Api;

import java.util.ArrayList;
import java.util.Date;

public class GetTransactionDetailsByIdResponse {
    public int id;
    public int userId;
    public int standardId;
    public String date;
    public String dueDate;
    public Object paymentDate;
    public Object refundDate;
    public Object transferDate;
    public Object paymentId;
    public String amount;
    public int transactionFee;
    public int settlementFee;
    public int amountPayable;
    public Object processignPaidByIns;
    public String org;
    public String orgId;
    public String orgName;
    public Object payment_method;
    public Object attempt;
    public String status;
    public Object trnsDetails;
    public String receipt;
    public Object callback;
    public String note;
    public String linkSentBy;
    public Object refundedBy;
    public Object transferedBy;
    public String transactionPaidBy;
    public Object gst;
    public boolean gstApplicable;
    public Object discount_details;
    public Object addition_details;
    public int total_discount;
    public int total_addition;
    public String payment_type;
    public String cheque_no;
    public User user;

    public GetTransactionDetailsByIdResponse(int id, int userId, int standardId, String date, String dueDate, Object paymentDate, Object refundDate, Object transferDate, Object paymentId, String amount, int transactionFee, int settlementFee, int amountPayable, Object processignPaidByIns, String org, String orgId, String orgName, Object payment_method, Object attempt, String status, Object trnsDetails, String receipt, Object callback, String note, String linkSentBy, Object refundedBy, Object transferedBy, String transactionPaidBy, Object gst, boolean gstApplicable, Object discount_details, Object addition_details, int total_discount, int total_addition, String payment_type, String cheque_no, User user) {
        this.id = id;
        this.userId = userId;
        this.standardId = standardId;
        this.date = date;
        this.dueDate = dueDate;
        this.paymentDate = paymentDate;
        this.refundDate = refundDate;
        this.transferDate = transferDate;
        this.paymentId = paymentId;
        this.amount = amount;
        this.transactionFee = transactionFee;
        this.settlementFee = settlementFee;
        this.amountPayable = amountPayable;
        this.processignPaidByIns = processignPaidByIns;
        this.org = org;
        this.orgId = orgId;
        this.orgName = orgName;
        this.payment_method = payment_method;
        this.attempt = attempt;
        this.status = status;
        this.trnsDetails = trnsDetails;
        this.receipt = receipt;
        this.callback = callback;
        this.note = note;
        this.linkSentBy = linkSentBy;
        this.refundedBy = refundedBy;
        this.transferedBy = transferedBy;
        this.transactionPaidBy = transactionPaidBy;
        this.gst = gst;
        this.gstApplicable = gstApplicable;
        this.discount_details = discount_details;
        this.addition_details = addition_details;
        this.total_discount = total_discount;
        this.total_addition = total_addition;
        this.payment_type = payment_type;
        this.cheque_no = cheque_no;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getStandardId() {
        return standardId;
    }

    public String getDate() {
        return date;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Object getPaymentDate() {
        return paymentDate;
    }

    public Object getRefundDate() {
        return refundDate;
    }

    public Object getTransferDate() {
        return transferDate;
    }

    public Object getPaymentId() {
        return paymentId;
    }

    public String getAmount() {
        return amount;
    }

    public int getTransactionFee() {
        return transactionFee;
    }

    public int getSettlementFee() {
        return settlementFee;
    }

    public int getAmountPayable() {
        return amountPayable;
    }

    public Object getProcessignPaidByIns() {
        return processignPaidByIns;
    }

    public String getOrg() {
        return org;
    }

    public String getOrgId() {
        return orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public Object getPayment_method() {
        return payment_method;
    }

    public Object getAttempt() {
        return attempt;
    }

    public String getStatus() {
        return status;
    }

    public Object getTrnsDetails() {
        return trnsDetails;
    }

    public String getReceipt() {
        return receipt;
    }

    public Object getCallback() {
        return callback;
    }

    public String getNote() {
        return note;
    }

    public String getLinkSentBy() {
        return linkSentBy;
    }

    public Object getRefundedBy() {
        return refundedBy;
    }

    public Object getTransferedBy() {
        return transferedBy;
    }

    public String getTransactionPaidBy() {
        return transactionPaidBy;
    }

    public Object getGst() {
        return gst;
    }

    public boolean isGstApplicable() {
        return gstApplicable;
    }

    public Object getDiscount_details() {
        return discount_details;
    }

    public Object getAddition_details() {
        return addition_details;
    }

    public int getTotal_discount() {
        return total_discount;
    }

    public int getTotal_addition() {
        return total_addition;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public String getCheque_no() {
        return cheque_no;
    }

    public User getUser() {
        return user;
    }
}

