/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Sebastian Steele
 */
package org.example;
import java.util.Scanner;

public class MultiStateTaxCalculator {
    public static void main(String[] args) {
        double tax = 0.0;
        Scanner intscan = new Scanner(System.in);
        System.out.print("What is the order amount? ");
        Integer order_amount = intscan.nextInt();

        Scanner scan = new Scanner(System.in);
        System.out.print("What state do you live in? ");
        String state = scan.nextLine();
        System.out.print("What county do you live in? ");
        String county = scan.nextLine();


        if(state.equals("Wisconsin")){
            tax = 0.05;
            if(county.equals("Eau Claire")){
                tax+= 0.005;
            }
            else if(county.equals("Dunn")){
                tax+=0.004;
            }
            else
                System.out.println("No county tax 4 U");
        }
        else if(state.equals("Illinois")){
            tax += 0.08;
        }
        else{
            System.out.println("No state tax 4 U");
        }

        double tax_amount = tax * order_amount;
        double total = tax_amount+ order_amount;

        System.out.println(String.format("The tax is $%.02f\nThe total is $%.02f", tax_amount, total));




    }
}
