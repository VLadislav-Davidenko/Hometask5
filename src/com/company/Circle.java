package com.company;
/**
 * Class Circle for to give an ability to create Objects Circle with its colour and radius and compute its Length and Area
 */

import java.lang.Math;

public class Circle {
    double radius;
    double length;
    double area;
    String colour;


    public Circle(double radius) {
        this.radius = radius;
        length = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
        length = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    public static void answer(Circle data){
        if (data.colour == null) {
            System.out.println("R = " + data.radius + "\n C = " + data.length + "\n S = " + data.area + "\n\n");
        } else{
            System.out.println("R = " + data.radius + "\n C = " + data.length + "\n S = " + data.area + "\nCol = " + data.colour + "\n\n");
        }


    }
}

