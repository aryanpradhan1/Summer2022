package com.topic28;


/**
 * Write a description of class Distance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;

public class Distance
{
    public static void main (String[] args) {
        //Declaring varibales and initializing the scan object
        double x1, y1, x2, y2, distance;
        Scanner scan = new Scanner(System.in);
        
        //Initializing the fmt object 3 decimal places
        DecimalFormat fmt = new DecimalFormat ("0.###");
        
        //Basically reads each coordinate and stores them in the corresponding variable
        System.out.println ("Enter the first x-coordinate: ");
        x1 = scan.nextDouble();
        
        System.out.println ("Enter the first y-coordinate: ");
        y1 = scan.nextDouble();
        
        System.out.println ("Enter the second x-coordinate: ");
        x2 = scan.nextDouble();
        
        System.out.println ("Enter the second y-coordinate: ");
        y2 = scan.nextDouble();
        
        //Calculating the distance using the distance formula
        distance = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 + y1), 2)));
        
        //Prints out the 2 coordinates and the distance between them
        //Also uses the fmt object in case user inputted points with 1 - 3 decimal places
        System.out.println ("Your coordinates were (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + "). The distance between these 2 points is " + fmt.format(distance));
    }
}
