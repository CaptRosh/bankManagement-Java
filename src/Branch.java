package com.RS.BankManagement;

import java.util.ArrayList;

public class Branch {
    public String name;
    public ArrayList<Customer> customer;

    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void custDetails(){
        System.out.println("1: Add Customer\n" +
                "2: Enter Account\n" +
                "3: List Customers\n" +
                "4: Quit\n");
    }
    public void newCust(String name, int initialAmount){
        if(customer.contains(name)){
            System.out.println("Error: Account already exists.\n");
        }
        else{
            this.customer.add(new Customer(name,initialAmount));
            System.out.println("New Account Added.\n");
        }
    }
    public void listCust() {
                System.out.println("Customer List:");
        for(int i = 0; i< customer.size(); i++){
            System.out.println(i+1+ ":\t" + customer.get(i).getName());
        }
    }

}

