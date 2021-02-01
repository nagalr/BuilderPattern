package com.example;

/**
 * Created by ronnen on 01-Feb-2021
 */

// Simple Builder-pattern Implementation
public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;

    private BankAccount() {
        //Constructor is private.
    }

    // static-inner-class implements the Builder-pattern
    public static class Builder {
        private long accountNumber; //This is important, so we'll pass it to the constructor
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this; //By returning the builder each time, we can create a fluent interface
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            //Here we create the actual bank account object, which is always in a fully initialized state
            BankAccount account = new BankAccount(); //Since the builder is in the BankAccount
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.branch = this.branch;
            account.balance = this.balance;
            account.interestRate = this.interestRate;
            return account;

        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
