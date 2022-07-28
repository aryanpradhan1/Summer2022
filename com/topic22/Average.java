package com.topic22; 
/**
 * Name: Aryan Pradhan
 * Date: 07/24/2022
 * Program Title: Average
 * Program description: Reads 3 numbers into 3 different variables and prints their average
 * Variable List: a, b, c
 */

import java.util.Scanner;

public class Average
{
    public static void main (String[] args)
    {
        double a, b, c; // The variables for our 3 numbers
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println ("Enter the first number: ");
        a = scan.nextDouble();
        
        System.out.println ("Enter the second number: ");
        b = scan.nextDouble();
        
        System.out.println ("Enter the third number: ");
        c = scan.nextDouble();
        
        double average = (a + b + c) / 3.0;
        
        System.out.println ("The average of the 3 numbers is: " + average);
    }
}
