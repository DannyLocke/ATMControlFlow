package com.ironyard;

import java.io.*;

/**
 * Created by dlocke on 11/16/16.
 */
public class Transaction {

    //variables
    private String name;
    private int transaction;
    private int withdraw;
    private int money = 100;

    //method to receive user name
    public void chooseName() throws Exception{
        System.out.println("What is your name?");
        name = Welcome.scanner.nextLine();

        //if statement to ensure a name is entered
        if(name.isEmpty() ){
            throw new Exception("No name entered. Please enter your name.");
        }else{
        System.out.println("Welcome to Wells Fargo, " + name);
        }
    }//end chooseName()

    //method to get user transaction choice
    public void transactionChoice() throws Exception {

        try {

            System.out.println("Enter 1 to check your balance, 2 to withdraw funds or 3 to cancel.");
            transaction = Welcome.scanner.nextInt();

            if (transaction != 1 && transaction != 2 && transaction != 3) {
                System.out.println("Only enter a '1', '2', or '3'.");
            }

        }//end try
        catch (Exception e){
            System.out.println("Invalid Input");
        }//end catch

            //balance
            if (transaction == 1) {
                System.out.println("Your balance is $100.");

                //withdrawal
            } else if (transaction == 2) {
                System.out.println("How much money would you like to withdraw?");
                withdraw = Welcome.scanner.nextInt();

                //ensure sufficient funds
                if (withdraw > 0 && withdraw <= 100) {
                    money = money - withdraw;
                    System.out.println("Thank you. Here is your $" + withdraw + ".00 dollars. Please take your money.");
                    System.out.println("Your new balance is: $" + money + ".00. Have a nice day!");
                } else if (withdraw > 100) {
                    throw new Exception("Insufficient Funds.");
                }

                //cancel
            } else if (transaction == 3) {
                System.out.println("Thank you and please come again.");

                //if the entry is something other than 1, 2 or 3
            } else throw new Exception("Only enter a '1', '2', or '3'.");

        }//end transactionChoice()

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTransaction() {
        return transaction;
    }

    public void setTransaction(int transaction) {
        this.transaction = transaction;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

}//end class Transaction
