package ca.ciccc.wmad.assignment2.main.question3;

import java.util.Scanner;

public class Question3 {
    public void ConvertToBinary(){
        Scanner in = new Scanner(System.in);

        System.out.format("Please enter a number: ");
        int DecimalNumber = in.nextInt();
        System.out.println(Integer.toBinaryString(DecimalNumber));

    }
}
