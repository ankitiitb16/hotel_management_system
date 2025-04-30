package com.lld.hotel_management_system.services;

import com.lld.hotel_management_system.billing.Invoice;

import java.util.Date;

public abstract class Service {
    private Date issueAt;

    public boolean addInvoiceItem(Invoice invoice) {
        return false;
    }


}
