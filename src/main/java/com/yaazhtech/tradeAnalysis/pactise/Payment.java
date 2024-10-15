package com.yaazhtech.tradeAnalysis.pactise;

class Payment {
    private String clientName;
    private String subscriptionName;
    private double amount;
    private double gst;
    private double costToPay;
    private boolean paymentStatus;

    public Payment(String clientName, String subscriptionName, double amount, double gst, boolean paymentStatus) {
        this.clientName = clientName;
        this.subscriptionName = subscriptionName;
        this.amount = amount;
        this.gst = gst;
        this.costToPay = amount + (amount * gst / 100);
        this.paymentStatus = paymentStatus;
    }

    public String getClientName() {
        return clientName;
    }

    public String getSubscriptionName() {
        return subscriptionName;
    }

    public double getAmount() {
        return amount;
    }

    public double getGst() {
        return gst;
    }

    public double getCostToPay() {
        return costToPay;
    }

    public boolean isPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
