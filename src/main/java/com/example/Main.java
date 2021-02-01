package com.example;

/**
 * Created by ronnen on 01-Feb-2021
 */


public class Main {

    public static void main(String[] args) {

        // creating two BankAccount Objects using the Builder-pattern
        // the builder inner-class.
        BankAccount account = new BankAccount.Builder(123L)
                .withOwner("Merge")
                .atBranch("SpringField")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount account1 = new BankAccount.Builder(456L)
                .withOwner("Homer")
                .atBranch("other-branch")
                .build();

        System.out.println(account);
        System.out.println(account1);
    }
}
