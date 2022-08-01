package com.topic23;


/**
 * Name: Aryan Pradhan
 * Date: 08/01/2022
 * Program Title: QuotientPower
 * Program description: Reads 2 numbers into 2 different variables and prints:
 * 1. the sum of their quotient and remainder
 * 2. The first number to the power of the second number
 * Variable List: a, b
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class QuotientPower
{
    
    public static void main (String[] args) {
        //First we create our variables and set up the scanner object
        double a, b;
        Scanner scan = new Scanner(System.in);
        
        //a is our first number
        System.out.println ("Enter your first number: ");
        a = scan.nextDouble();
        
        //b is our second number
        System.out.println ("Enter your second number: ");
        b = scan.nextDouble();
        
        //Set up the fmt object to round to 3 decimal places
        DecimalFormat fmt = new DecimalFormat("0.###");
        
        double quotient = a / b;
        double remainder = a % b;
        double totalSum = quotient + remainder;
        double power = Math.pow(a, b);
        
        //Print out the sum of the quotient and remainder
        System.out.println ("The sum of the quotient and remainder of your 2 numbers is: " + fmt.format(totalSum));
        
        //Print out a to the power of b
        System.out.println ("Your first number to the power of your second number is: " + fmt.format(power));
        
    
    }
    
}
