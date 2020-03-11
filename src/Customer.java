package com.RS.BankManagement;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Integer> transaction;
    private ArrayList<String> history;
    private int balance = 0;


    public Customer(String name, int initialAmount){
        this.name = name;
        this.transaction = new ArrayList<>();
        this.history= new ArrayList<>();
        deposit(initialAmount);
    }
    public String getName() {
        return name;
    }
    public void transDetails() {
        System.out.println("Customer Options:\n" +
                "1: Withdraw\n" +
                "2: Deposit\n" +
                "3: Print Log\n" +
                "4: Quit\n");
    }
    public void withdrawal(int input){
        balance -= input;
        System.out.println("Withdrawal of Rupees "+ input + " made.");
        System.out.println("Balance = " + balance +"\n");
        this.history.add("Withdrawal");
        this.transaction.add(input);
    }

    public void deposit(int input){
        balance += input;
        System.out.println("Deposit of Rupees " + input + " made.");
        System.out.println("Balance = " + balance);
        this.history.add("Deposit");
        this.transaction.add(input);
    }
    public void history(){
        System.out.println("Transaction History");
        System.out.println("Transaction       Amount\n");
        for(int i = 0;i<history.size();i++){
            if(history.get(i) == "Deposit"){
                System.out.println(history.get(i) + "   \t\t" + transaction.get(i));
            } else {
                System.out.println(history.get(i) + "\t\t" + transaction.get(i));
            }
        }
        System.out.println("\n");
        System.out.println("Balance: " + balance + "\n");
    }
}
