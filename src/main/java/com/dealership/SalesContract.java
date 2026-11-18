package com.dealership;

import javax.swing.plaf.basic.BasicTextUI;
import java.math.BigDecimal;

public class SalesContract extends Contract {
    private double taxAmount;
    private BigDecimal feeRecording;
    private BigDecimal feeProcessing;
    private boolean isFinanced;
    private BigDecimal priceMonthly;

    public SalesContract(String date, String customerName, String customerEmail, int vehiclesSold, BigDecimal price, BigDecimal priceMonthly, double taxAmount, BigDecimal feeRecording, BigDecimal feeProcessing, boolean isFinanced, BigDecimal priceMonthly1) {
        super(date, customerName, customerEmail, vehiclesSold, price, priceMonthly);
        this.taxAmount = taxAmount;
        this.feeRecording = feeRecording;
        this.feeProcessing = feeProcessing;
        this.isFinanced = isFinanced;
        this.priceMonthly = priceMonthly;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getFeeRecording() {
        return feeRecording;
    }

    public void setFeeRecording(BigDecimal feeRecording) {
        this.feeRecording = feeRecording;
    }

    public BigDecimal getFeeProcessing() {
        return feeProcessing;
    }

    public void setFeeProcessing(BigDecimal feeProcessing) {
        this.feeProcessing = feeProcessing;
    }

    public boolean isFinanced() {
        return isFinanced;
    }

    public void setFinanced(boolean financed) {
        isFinanced = financed;
    }

    public BigDecimal getPriceMonthly() {
        return priceMonthly;
    }

    public void setPriceMonthly(BigDecimal priceMonthly) {
        this.priceMonthly = priceMonthly;
    }

    @Override
    public BigDecimal getTotalPrice() {
        return null;
    }
    @Override
    public BigDecimal getMonthlyPayment() {
        return null;
    }
    @Override
    public String toString() {
        return "SALES" + "|" + getDate() + "|" + getCustomerName() + "|" + getCustomerEmail() + "|" + getVehicleSold()
                + "|" + getTaxAmount() + "|" + getFeeRecording() + "|" + getFeeProcessing()  + "|"
                + getContractTotal() + "|" + isFinanced() + "|" + getContractMonthly();
    }
}
