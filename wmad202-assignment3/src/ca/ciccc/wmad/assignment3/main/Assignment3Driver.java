package ca.ciccc.wmad.assignment3.main;

import ca.ciccc.wmad.assignment3.main.question1.Question1;
import ca.ciccc.wmad.assignment3.main.question2.Question2;
import ca.ciccc.wmad.assignment3.main.question3.Question3;
import ca.ciccc.wmad.assignment3.main.question4.Question4;

public class Assignment3Driver {
    public static void run(){
        Question1 q1 = new Question1();
        q1.primeNumber();
        Question2 q2 = new Question2();
        q2.closestPrimeNumber();
        Question3 q3 = new Question3();
        q3.shapeInput();
        Question4 q4 = new Question4();
        q4.numbersList();
    }

}
