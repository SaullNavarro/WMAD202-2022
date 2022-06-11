package ca.ciccc.wmad.assignment2.main.question2;

import java.util.Scanner;

public class Question2 {
    public void ReversedNumbers(){
        Scanner in = new Scanner(System.in);

        System.out.format("Please enter a whole number: ");
        int wholenumber = in.nextInt();
        int reversed = 0;

        while ( wholenumber % 10 == 0){
            System.out.println("Please enter valid number: ");
            wholenumber = in.nextInt();
        }
        while (wholenumber != 0){
            int digit = wholenumber % 10;
            reversed = reversed * 10 + digit;
            wholenumber /= 10 ;

        }
        System.out.println("Reversed number: "+ reversed);
    }

}
