package ca.ciccc.wmad.assignment3.main;

import ca.ciccc.wmad.assignment3.main.question1.Question1;
import ca.ciccc.wmad.assignment3.main.question2.Question2;
import ca.ciccc.wmad.assignment3.main.question3.Question3;
import ca.ciccc.wmad.assignment3.main.question4.Question4;
import ca.ciccc.wmad.assignment3.main.question5.Question5;
import ca.ciccc.wmad.assignment3.main.question6.Question6;
import ca.ciccc.wmad.assignment3.main.question7.Question7;
import ca.ciccc.wmad.assignment3.main.question8.Question8;

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
        Question5 q5 = new Question5();
        q5.itemsAndRepetitions();
        Question6 q6 = new Question6();
        q6.listArray();
        Question7 q7 = new Question7();
        q7.linearSearch();
        Question8 q8 = new Question8();
        q8.toppedLimit();

    }

}
