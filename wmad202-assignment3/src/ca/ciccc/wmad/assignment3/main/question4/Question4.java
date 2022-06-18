package ca.ciccc.wmad.assignment3.main.question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Question4 {
    public static void numbersList(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();
        int []frequencies = new int[100];

        System.out.format("Please enter a number between 1-99: ");
        while (input.hasNextInt()){
            int nextNumber = input.nextInt();
            numbersList.add(nextNumber);
            System.out.format("Please enter another number: ");
        }
        for (Integer number : numbersList){
            frequencies[number]++;
        }
        int mostRepeatedItem = 0;
        int timesRepeated = 0;

        for (int i = 1; i < frequencies.length; i++ ){
            if (timesRepeated < frequencies[i]){
                mostRepeatedItem = i;
                timesRepeated = frequencies[i];
            }
        }
        System.out.format("The most repeated number is: %d\n", mostRepeatedItem);
    }
}
