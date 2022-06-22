package ca.ciccc.assignment4.main.question1;
/*Write a method which has no input parameter. The method asks the user to enter
        numbers. The user can enter repeated numbers but if the user entered a number which
        was already entered, the method will provide an error message to the user and ask the
        user to enter another one. The user can enter numbers as long as s/he has not entered 0.
        Once a 0 is entered, the method returns the sum of all distinct numbers the user had entered.*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Question1 {
    public void noParameters(){
        Scanner input = new Scanner(System.in);
        System.out.format("Please enter a number: ");
        HashSet<Integer> numbers = new HashSet<>();
        int nextNumber = input.nextInt();

        while (nextNumber != 0){
            if (numbers.contains(nextNumber)){
                System.out.printf("%d already exists.\n", nextNumber);
            }
            else {
                numbers.add(nextNumber);
            }
            System.out.format("Please continue: ");
            nextNumber = input.nextInt();
        }
        int total = 0;
        for (Integer number : numbers){
            total += number;
        }
        System.out.println(total);
    }
}
