package com.practise.designpatterns;

// Builder pattern ---used to build complex objects, prevent
// passing parameters in wrong order than as expected
public class OnlineStoreAccount {

    private Long id;
    private String name;
    private String address;
    private double budget;
    private double discountRate;

    private OnlineStoreAccount(){

    }

    /*public OnlineStoreAccount(Long id, String name, String address, double budget, double discountRate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.budget = budget;
        this.discountRate = discountRate;
    }*/

    public static class Builder {
        private Long id;
        private String name;
        private String address;
        private double budget;
        private double discountRate;

        public Builder(Long id) {
            this.id = id;

        }

        public Builder withName(String name) {
            this.name = name;
            return this;

        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
            
        }

        public Builder withBudget(double budget) {
            this.budget = budget;
            return this;
        }

        public Builder withDiscountRate(double discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        public OnlineStoreAccount build() {
            OnlineStoreAccount onlineStoreAccount = new OnlineStoreAccount();
            onlineStoreAccount.id = this.id;
            onlineStoreAccount.name = this.name;
            onlineStoreAccount.address = this.address;
            onlineStoreAccount.budget = this.budget;
            onlineStoreAccount.discountRate = this.discountRate;

            return onlineStoreAccount;

        }

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getBudget() {
        return budget;
    }

    public double getDiscountRate() {
        return discountRate;
    }
}
