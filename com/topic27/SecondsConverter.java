package com.topic27;


/**
 * Write a description of class SecondsConverter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class SecondsConverter
{
    public static void main (String[] args) {
        //Declaring variables and creating the scan object
        int seconds, minutes, hours, remainingSeconds, remainingMinutes;
        Scanner scan = new Scanner(System.in);
        
        //Reading for user input of how many seconds there are
        System.out.println ("Enter the number of seconds: ");
        seconds = scan.nextInt();
        
        /**
         * There are 3,600 seconds in an hour which is why we divide by 3600
         * Additionally because hours is an int it will round down to the nearest integer when storing the data value
         */
        hours = (seconds / 3600);
        
        remainingSeconds = seconds % 3600;
        
        /**
         * There are 60 seconds in a minute which is why we divide by 60
         * Additionally because remainingMinutes is an int it will round down to the nearest integer when storing the data value
         */
        remainingMinutes = remainingSeconds / 60;
        
        remainingSeconds = remainingSeconds % 60;
        
        System.out.println (seconds + " seconds is " + hours + " hours, " + remainingMinutes + " minutes, and " + remainingSeconds + " seconds!");
    
    }
}
