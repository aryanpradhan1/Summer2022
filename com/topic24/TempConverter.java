package com.topic24;


/**
 * Name: Aryan Pradhan
 * Date: 08/01/2022
 * Program Title: TempConverter
 * Program description: Reads a temperature in Celsius, converts it to Fahrenheit, and prints it out
 * Variable List: BASE, CONVERSION_FACTOR, celsiusTemp, fahrenheitTemp
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class TempConverter
{
    public static void main(String[] args) {
        //Set up scan object and declare variables
        double celsiusTemp;
        Scanner scan = new Scanner(System.in);
        
        //Base equals 32
        final int BASE = 32;
        
        //Conversin Factor equals 5/9
        final double CONVERSION_FACTOR = 5.0 / 9.0;
        
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        //Ask user for temperature in Celsius and record user input
        System.out.println ("Enter your temperature in Celsius: ");
        celsiusTemp = scan.nextDouble();
        
        //Convert to fahrenheit
        double fahrenheitTemp = (celsiusTemp - BASE) * CONVERSION_FACTOR;
        
        System.out.println ("Your temperature in Fahrenheit is: " + fmt.format(fahrenheitTemp));
        
    }
}
