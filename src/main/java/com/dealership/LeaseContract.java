package com.dealership;

import java.math.BigDecimal;

public class LeaseContract extends Contract {
    private BigDecimal price;
    private BigDecimal feeExpectedEndingValue;
    private BigDecimal feeLease;

    public LeaseContract(String date, String customerName, String customerEmail, int vehiclesSold, BigDecimal price, BigDecimal priceMonthly, BigDecimal price1, BigDecimal feeExpectedEndingValue, BigDecimal feeLease) {
        super(date, customerName, customerEmail, vehiclesSold, price, priceMonthly);
        this.price = price1;
        this.feeExpectedEndingValue = feeExpectedEndingValue;
        this.feeLease = feeLease;
    }

    public BigDecimal getFeeExpectedEndingValue() {
        return feeExpectedEndingValue;
    }

    public void setFeeExpectedEndingValue(BigDecimal feeExpectedEndingValue) {
        this.feeExpectedEndingValue = feeExpectedEndingValue;
    }

    public BigDecimal getFeeLease() {
        return feeLease;
    }

    public void setFeeLease(BigDecimal feeLease) {
        this.feeLease = feeLease;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
        return "LEASE" + "|" + getDate() + "|" + getCustomerName() + "|" + getCustomerEmail() + "|" + getVehicleSold()
                + "|" + getFeeExpectedEndingValue() + "|" + getFeeLease() + "|" + getTotalPrice()  + "|" + getContractMonthly();
    }
}
