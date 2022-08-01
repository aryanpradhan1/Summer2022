package com.topic23;


/**
 * Name: Aryan Pradhan
 * Date: 08/01/2022
 * Program Title: SumDiffProduct
 * Program description: Reads 2 numbers into 2 different variables and prints their sum, difference, and product
 * Variable List: a, b
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class SumDiffProduct
{
    public static void main (String[] args) {
        //First we create the variables a and b and set up the scan object
        double a, b;
        Scanner scan = new Scanner(System.in);
        
        //a is our first number
        System.out.println ("Enter your first number: ");
        a = scan.nextDouble();
        
        //b is our second number
        System.out.println ("Enter your second number: ");
        b = scan.nextDouble();
        
        
        //Set up the fmt object to round to 3 decimal places
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        double sum = a + b;
        double difference = a - b;
        double product = a * b;
        
        //Print out the sum, difference, and product of the 2 numbers
        System.out.println("The sum of the 2 numbers is: " + fmt.format(sum));
        System.out.println("The difference of the 2 numbers is: " + fmt.format(difference));
        System.out.println("The product of the 2 numbers is: " + fmt.format(product));
        
    }
    
}
