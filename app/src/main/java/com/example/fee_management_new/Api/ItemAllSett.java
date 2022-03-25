package com.example.fee_management_new.Api;

import java.util.Date;

// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
// import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString, Root.class); */
public class ItemAllSett {
    public int id;
    public String orgId;
    public int settlementId;
    public String status;
    public String refNo;
    public Object rejectReason;
    public String invoice;
    public String startDate;
    public String endDate;
    public String transactionId;
    public Date openedDate;
    public Date closedDate;
    public String total;
    public int noOftransactions;

    public ItemAllSett(int id, String orgId, int settlementId, String status, String refNo, Object rejectReason, String invoice, String startDate, String endDate, String transactionId, Date openedDate, Date closedDate, String total, int noOftransactions) {
        this.id = id;
        this.orgId = orgId;
        this.settlementId = settlementId;
        this.status = status;
        this.refNo = refNo;
        this.rejectReason = rejectReason;
        this.invoice = invoice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.transactionId = transactionId;
        this.openedDate = openedDate;
        this.closedDate = closedDate;
        this.total = total;
        this.noOftransactions = noOftransactions;
    }

    public int getId() {
        return id;
    }

    public String getOrgId() {
        return orgId;
    }

    public int getSettlementId() {
        return settlementId;
    }

    public String getStatus() {
        return status;
    }

    public String getRefNo() {
        return refNo;
    }

    public Object getRejectReason() {
        return rejectReason;
    }

    public String getInvoice() {
        return invoice;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public Date getOpenedDate() {
        return openedDate;
    }

    public Date getClosedDate() {
        return closedDate;
    }

    public String getTotal() {
        return total;
    }

    public int getNoOftransactions() {
        return noOftransactions;
    }
}
