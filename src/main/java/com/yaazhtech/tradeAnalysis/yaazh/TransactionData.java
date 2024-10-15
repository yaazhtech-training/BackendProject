package com.yaazhtech.tradeAnalysis.yaazh;

import java.time.LocalDate;

public class TransactionData {
    private LocalDate date;
    private double amount;
    private String bicfi;

    public TransactionData(LocalDate date, double amount, String bicfi) {
        this.date = date;
        this.amount = amount;
        this.bicfi = bicfi;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getBicfi() {
        return bicfi;
    }
}
