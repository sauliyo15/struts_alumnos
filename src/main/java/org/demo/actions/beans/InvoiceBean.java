package org.demo.actions.beans;

import java.util.Date;

public class InvoiceBean {
    private String subject;
    private Date dateFrom;
    private Date dateTo;
    private double price;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

    public double getPrice() {return price; }

    public void setPrice(double price) { this.price = price; }

    public double getTaxes() {
        return price * 0.21;
    }

    public double getTotal() {
        return price * 1.21;
    }
}
