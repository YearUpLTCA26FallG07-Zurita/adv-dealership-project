package com.dealership;

import java.math.BigDecimal;
import java.util.List;

public abstract class Contract {
    private static String date;
    private String customerName;
    private String customerEmail;
    private int vehicleSold;
    private BigDecimal contractTotal;
    private BigDecimal contractMonthly;


    public Contract(String date, String customerName, String customerEmail, int vehicleSold, BigDecimal price, BigDecimal priceMonthly) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.contractTotal = contractTotal;
        this.contractMonthly = contractMonthly;

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public int getVehicleSold() {
        return vehicleSold;
    }

    public void setVehiclesSold(int vehiclesSold) {
        this.vehicleSold = vehicleSold;
    }

    public BigDecimal getContractTotal() {
        return contractTotal;
    }

    public void setContractTotal(BigDecimal priceTotal) {
        this.contractTotal = contractTotal;
    }

    public void setContractMonthly(BigDecimal priceMonthly) {
        this.contractMonthly = priceMonthly;
    }

    public BigDecimal getContractMonthly() {
        return contractMonthly;
    }


    public abstract BigDecimal getTotalPrice();

    public abstract BigDecimal getMonthlyPayment();
}