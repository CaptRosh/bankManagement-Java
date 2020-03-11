package com.RS.BankManagement;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static Bank bank = new Bank("ICICI Bank");
    public static void main(String[] args){
        boolean cond = true;
        int input;
        bank.newBranch("Mulund");
        bank.newBranch("Airoli");

        while(cond){
            bankChoice();
            System.out.println("Enter Choice");
            input = in.nextInt();

            switch(input){
                case 1:
                    enterBranch();
                    break;
                case 2:
                    cond = false;
                    break;
            }
        }

    }
    public static void bankChoice(){
        System.out.println("Bank Options:\n" +
                "1: Enter Bank\n" +
                "2: Exit");
    }
    public static void enterBranch(){
        boolean cond = true;
        while(cond){
            bank.branchChoice();
            int input = in.nextInt();
            switch (input){
                case 1:
                    System.out.println("Enter the name of new branch");
                    in.nextLine();
                    bank.newBranch(in.nextLine());
                    break;
                case 2:
                    bank.listBranch();
                    custChoice(in.nextInt());
                    break;
                case 3:
                    bank.listBranch();
                    break;
                case 4:
                    cond = false;
                    break;
            }
        }
    }
    public static void  custChoice(int input) {
        Branch selected = bank.branch.get(input-1);
        boolean cond = true;
        while (cond) {
            selected.custDetails();
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    in.nextLine();
                    System.out.println("Enter your name");
                    String name = in.nextLine();
                    System.out.println("Enter the initial amount of deposit");
                    int initial = in.nextInt();
                    selected.newCust(name, initial);
                    break;
                case 2:
                    selected.listCust();
                    transChoice(input,in.nextInt());
                    break;
                case 3:
                    for(int i =0; i<selected.customer.size();i++){
                        System.out.println(i+1 + ":\t"+ selected.customer.get(i).getName());
                    }
                    break;
                case 4:
                    cond=false;
                    break;
            }
        }
    }
    public static void transChoice(int branch,int input){
        Branch select =  bank.branch.get(branch-1);
        Customer selected = select.customer.get(input-1);
        boolean cond = true;
        while(cond){
            selected.transDetails();
            int choice = in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter amount to withdraw");
                    selected.withdrawal(in.nextInt());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit");
                    selected.deposit(in.nextInt());
                    break;
                case 3:
                    selected.history();
                    break;
                case 4:
                    cond = false;
                    break;
            }
        }

    }
}
