package com.ironyard;

/**
 * Created by dlocke on 11/16/16.
 */
public class Transaction {

    //variables
    private String name;
    private int transaction;
    private int withdraw;

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
    public void transactionChoice() throws Exception{
        System.out.println("Enter 1 to check your balance, 2 to withdraw funds or 3 to cancel.");
        transaction = Welcome.scanner.nextInt();

            //balance
        if(transaction == 1) {
            System.out.println("Your balance is $100.");

                  //withdrawal
        }else if (transaction == 2){
            System.out.println("How much money would you like to withdraw?");
            withdraw = Welcome.scanner.nextInt();

                //ensure sufficient funds
                if (withdraw > 0 && withdraw <=100){
                    System.out.println("Thank you. Here is your " + withdraw + " dollars. Please take your money.");
                }else if (withdraw > 100){
                    throw new Exception("Insufficient Funds.");
                }

        //cancel
        }else if (transaction == 3){
            System.out.println("Thank you and please come again.");

            //if a number other than 1, 2 or 3 is entered
        } else throw new Exception("Invalid number entered.");

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
