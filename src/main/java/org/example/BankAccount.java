package org.example;

public class BankAccount {

    BankDetails bankDetails;
    String accountNumber;
    int balance;

    public BankAccount(BankDetails bankDetails, String accountNumber, int balance) {
        this.bankDetails = bankDetails;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
