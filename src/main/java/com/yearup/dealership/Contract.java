package com.yearup.dealership;

public abstract class Contract {
    private String dateOfContract;
    private String customerName;
    private String customerEmail;
    private String vehicleSold;
    private double totalPrice;
    private double monthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getDateOfContract() {
        return dateOfContract;
    }

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();


    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public abstract double getMonthlyPayment();

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }
}

