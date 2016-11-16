package com.ironyard;

import java.util.Scanner;

/**
 * Created by dlocke on 11/16/16.
 */
public class Welcome {

    //receive user input
    public static Scanner scanner = new Scanner(System.in);
    public static Transaction transaction = new Transaction();

    //main method to run the program
    public static void main(String[] args) throws Exception{
        System.out.println("Hello"); //output to user

        //call methods
        transaction.chooseName();
        transaction.transactionChoice();

    }//end main()

}//end class Welcome
