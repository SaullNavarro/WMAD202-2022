package ca.ciccc.wmad.assignment2.main.question5.problem2;

import java.util.Scanner;

public class Question5 {

    public void ReversedString(){
        Scanner in = new Scanner(System.in);
        System.out.println("Please write a Word: ");
        char ch;
        String word = in.next(), reversed = "";
        System.out.println(word);
        System.out.println(reversed);

        for (int i = 0; i < word.length(); i++){
            ch = word.charAt(i);
            reversed = String.valueOf(ch).concat(reversed);
        }
        System.out.printf("Reversed word is: %s", reversed);


    }

}
