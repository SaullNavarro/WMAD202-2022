package ca.ciccc.wmad.assignment2.main.question7;

import java.util.Scanner;

public class Question7 {
    private final double PI = 3.14;

    public void CircleAreaOutsideOfSquare() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the side of a square: ");
        int len = in.nextInt();
        System.out.printf("The circle area is %f", circleAreaOutsideOfSquare(len));
    }

    private double circleAreaOutsideOfSquare(int lenOfSideOfSquare) {
        double diameter = Math.sqrt(Math.pow(lenOfSideOfSquare, 2) + Math.pow(lenOfSideOfSquare, 2));
        double radius = diameter / 2;

        return radius * radius * PI;
    }
}