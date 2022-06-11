package ca.ciccc.wmad.assignment2.main.question1;

import java.util.Scanner;

public class Question1 {
    public void InputTwoNumbers(){
        Scanner in = new Scanner(System.in);

        System.out.format("Please enter numberA: ");
        int numA = in.nextInt();

        System.out.format("Please enter numberB: ");
        int numB = in.nextInt();

        printDivisibleNumbersBy3And5(numA, numB);
        printDivisibleNumbersBy6And7(numA, numB);
        printNotDivisibleNumbersBy3(numA, numB);
    }

    private void printDivisibleNumbersBy3And5(int numA, int numB) {
        for (int i=numA; i<=numB; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
    }
    private void printDivisibleNumbersBy6And7(int numA, int numB){
        for (int i=numA; i<=numB ; i++){
            if (i % 6 == 0 || i % 7 == 0){
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
    private void printNotDivisibleNumbersBy3(int numA, int numB){
        for (int i =numA; i <= numB ; i++){
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println();
    }
}
