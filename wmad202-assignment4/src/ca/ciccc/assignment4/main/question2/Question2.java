package ca.ciccc.assignment4.main.question2;
/*Write a method which lets the user enter English words. The user can keep entering
        English words as long as the user has not entered the word “exit”. Once the user enters
        “exit” the method will return and print the list of all distinct words starts with English
        alphabets. Like:
        A: Ali, apple, …
        B: Bob, book
        … until Z*/

import java.util.*;

public class Question2 {
    public void englishWords(){
        Scanner input = new Scanner(System.in);
        HashMap<Character, ArrayList<String>> words = new HashMap<>();
        System.out.println("Please enter a word: ");
        String nextWord = input.next();

        for (char i = 'A'; i <= 'Z'; i++){
            words.put(i, new ArrayList<>());
        }
        System.out.print("Enter another word: ");

        while (!nextWord.equals("exit")){
            char firstLetter = nextWord.toUpperCase().charAt(0);
            if (!words.get(firstLetter).contains(nextWord)){
                words.get(firstLetter).add(nextWord);
                Collections.sort(words.get(firstLetter));
            }
        }
        System.out.print(words);
    }
}
