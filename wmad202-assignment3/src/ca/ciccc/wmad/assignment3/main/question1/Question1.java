package ca.ciccc.wmad.assignment3.main.question1;

import java.util.Scanner;

public class Question1 {
    public static void primeNumber(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = in.nextInt();
        if (isPrimeNumber(number)){
            System.out.println("This is a prime number!");
        }
        else{
            System.out.println("This is N-O-T a prime number");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
