package ca.ciccc.wmad.assignment2.main;

import ca.ciccc.wmad.assignment2.main.question1.Question1;
import ca.ciccc.wmad.assignment2.main.question10.Question10;
import ca.ciccc.wmad.assignment2.main.question2.Question2;
import ca.ciccc.wmad.assignment2.main.question3.Question3;
import ca.ciccc.wmad.assignment2.main.question4.Question4;
import ca.ciccc.wmad.assignment2.main.question5.problem2.Question5;
import ca.ciccc.wmad.assignment2.main.question6.Question6;
import ca.ciccc.wmad.assignment2.main.question7.Question7;
import ca.ciccc.wmad.assignment2.main.question8.Question8;
import ca.ciccc.wmad.assignment2.main.question9.Question9;

public class Assignment2Driver {
    public static void run() {
        Question1 q1 = new Question1();
        q1.InputTwoNumbers();
        Question2 q2 = new Question2();
        q2.ReversedNumbers();
        Question3 q3 = new Question3();
        q3.ConvertToBinary();
        Question4 q4 = new Question4();
        q4.InputUntilInvalid();
        Question5 q5 = new Question5();
        q5.ReversedString();
        Question6 q6 = new Question6();
        q6.OneAlphabeticVariables();
        Question7 q7 = new Question7();
        q7.CircleAreaOutsideOfSquare();
        Question8 q8 = new Question8();
        q8.test();
        Question9 q9 = new Question9();
        q9.test();
        Question10 q10 = new Question10();
        q10.test();

    }
}
