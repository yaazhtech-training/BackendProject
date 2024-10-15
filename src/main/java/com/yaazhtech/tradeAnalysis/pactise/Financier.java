package com.yaazhtech.tradeAnalysis.pactise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Financier {
    private List<Payment> payments;

    public Financier() {
        payments = new ArrayList<>();
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public double calculateTotalPendingPayment() {
        double totalPendingPayment = 0;
        for (Payment payment : payments) {
            if (!payment.isPaymentStatus()) {
                totalPendingPayment += payment.getCostToPay();
            }
        }
        return totalPendingPayment;
    }

    public void displayPaymentsAscendingOrderByAmount() {
        Collections.sort(payments, Comparator.comparingDouble(Payment::getAmount));
        System.out.println("Payment data in ascending order of amount attribute:");
        for (Payment payment : payments) {
            System.out.println(payment.getClientName() + " - Amount: " + payment.getAmount());
        }
    }

    public static void main(String[] args) {
        Financier financier = new Financier();

        // Adding sample payment data
        financier.addPayment(new Payment("Client1", "Subscription1", 2000, 18, false));
        financier.addPayment(new Payment("Client2", "Subscription2", 2000, 18, false));
        // Add more payment data as needed...

        double initialPendingPayment = financier.calculateTotalPendingPayment();
        System.out.println("Total pending payment: " + initialPendingPayment);

        // Simulating payment for Client1
        for (Payment payment : financier.payments) {
            if (payment.getClientName().equals("Client1")) {
                payment.setPaymentStatus(true);
                break;
            }
        }

        double updatedPendingPayment = financier.calculateTotalPendingPayment();
        System.out.println("Total pending payment after Client1's payment: " + updatedPendingPayment);

        financier.displayPaymentsAscendingOrderByAmount();
    }
}
