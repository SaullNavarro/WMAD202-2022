package ca.ciccc.wmad.assignment3.main.question6;

import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {
    public void listArray(){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> listArray = new ArrayList<>();
        int [] frequencies = new int[100];

        System.out.format("Enter a number: ");
        while (input.hasNextInt()){
            int nextNumber = input.nextInt();
            if (!listArray.contains(nextNumber)) listArray.add(nextNumber);
            System.out.format("Enter a number: ");
        }
        System.out.format("%s\n", listArray);
    }
}
