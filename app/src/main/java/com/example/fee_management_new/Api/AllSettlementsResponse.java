package com.example.fee_management_new.Api;

import java.util.ArrayList;
import java.util.Date;

public class AllSettlementsResponse {
    public ArrayList<ItemAllSett> items;
    public MetaAllSett meta;

    public AllSettlementsResponse(ArrayList<ItemAllSett> items, MetaAllSett meta) {
        this.items = items;
        this.meta = meta;
    }

    public ArrayList<ItemAllSett> getItems() {
        return items;
    }

    public MetaAllSett getMeta() {
        return meta;
    }
}


