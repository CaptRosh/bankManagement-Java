package com.RS.BankManagement;

import java.util.ArrayList;

public class Bank {
    private String name;
    public ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<>();
    }

    public void branchChoice(){
        System.out.println("Branch Options:\n" +
                "1: Add Branch\n" +
                "2: Enter a Branch\n" +
                "3: List Branches\n" +
                "4: Quit\n");
    }
    public void newBranch(String name){
        if(this.branch.contains(name)){
            System.out.println("Error: Branch already exists.\n");
        }
        else{
            this.branch.add(new Branch(name));
            System.out.println("New branch added.\n");
        }
    }
    public void listBranch() {
        System.out.println("Branch List:");
        for(int i=0; i<this.branch.size();i++){
            System.out.println(i+1+ ":\t" + branch.get(i).getName());
        }
    }
}
