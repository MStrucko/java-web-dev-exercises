package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
//A = pi * r * r
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with radius " + radius +" is " + area);
        if (radius <= 0){
            System.out.println("Please enter a positive number... ");
        }
    }
}

