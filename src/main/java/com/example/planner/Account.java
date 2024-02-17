package com.example.planner;

public class Account {
    int balance;
    String accountNumber;

    public void deposit(int amount){
        balance += amount;
    }

    public void withdraw(int amount){
        balance -= amount;
    }

    public int getBalance(){
        return balance;
    }

    public String getAccountNumber(){
        return accountNumber;
    }




}
