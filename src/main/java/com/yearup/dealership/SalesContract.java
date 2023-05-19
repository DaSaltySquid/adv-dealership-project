package com.yearup.dealership;

public class SalesContract {
    private double salesTaxAmount;
    private double recordingFee;
    private double processingFee;

    public SalesContract(double salesTaxAmount, double recordingFee, double processingFee) {
        this.salesTaxAmount = salesTaxAmount;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
    }

    public double getSalesTaxAmount() {
        return salesTaxAmount;
    }

    public void setSalesTaxAmount(double salesTaxAmount) {
        this.salesTaxAmount = .05;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = 100;
    }

    public double getProcessingFee() {
        if (Vehicle < 10000) {
            processingFee = 295;
        } else {
            processingFee = 495;
        }

        return 0;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = 295;
    }



    @Override
    public double getTotalPrice() {
        return getVehicleSold().getPrice() + salesTaxAmount + recordingFee + processingFee;
    }

    @Override
    public double getMonthlyPayment() {
        int numberOfPayments = 0;
        double interestRate = 0;
        if (financeOption) {
            if (getVehicleSold().getPrice() >= 10000) {
                numberOfPayments = 48;
                interestRate = 4.25 / 1200;
            } else {
                numberOfPayments = 24;
                interestRate = 5.25 / 1200;
            }

            double monthlyPayment = getTotalPrice() * (interestRate * Math.pow(1 + interestRate, numberOfPayments)) / (Math.pow(1 + interestRate, numberOfPayments) - 1);
            monthlyPayment = Math.round(monthlyPayment * 100);
            monthlyPayment /= 100;
            return monthlyPayment;
        } else {
            return 0.0;
        }
    }

    public salesContract(double)

}
