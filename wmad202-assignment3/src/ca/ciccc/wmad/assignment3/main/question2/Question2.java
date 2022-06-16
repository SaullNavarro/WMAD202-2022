package ca.ciccc.wmad.assignment3.main.question2;

import ca.ciccc.wmad.assignment3.main.question1.Question1;

import java.util.Scanner;

public class Question2 {
    public static void closestPrimeNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = in.nextInt();

        int newNumber = number + 1;
        while (!Question1.isPrimeNumber(newNumber)){
            newNumber++;
        }
        System.out.printf("The closest prime number is %d,\n",newNumber);

    }
}
