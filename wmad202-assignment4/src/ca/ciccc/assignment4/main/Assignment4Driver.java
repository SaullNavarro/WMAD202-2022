package ca.ciccc.assignment4.main;

import ca.ciccc.assignment4.main.question1.Question1;
import ca.ciccc.assignment4.main.question2.Question2;

public class Assignment4Driver {
    public static void run(){
        Question1 q1 = new Question1();
        q1.noParameters();
        Question2 q2 = new Question2();
        q2.englishWords();
    }

}
