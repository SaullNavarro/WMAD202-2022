package ca.ciccc.wmad.assignment2.main.question4;

import java.util.Scanner;

public class Question4 {
    public void InputUntilInvalid() {
        Scanner in = new Scanner(System.in);
        System.out.format("Please enter a number: ");
        int number = in.nextInt();
        int maximum = number;
        int minimum = number;

        System.out.format("Please enter a number: ");

        while (in.hasNextInt()){
            number = in.nextInt();
            if (number > maximum){
                maximum = number;
            }
            if (number < minimum){
                minimum = number;
            }
            System.out.format("Please enter a number: ");
        }

        int distance = Math.abs(maximum - minimum);
        System.out.printf("%d, %d, %d\n", maximum, minimum, distance);

    }

}
