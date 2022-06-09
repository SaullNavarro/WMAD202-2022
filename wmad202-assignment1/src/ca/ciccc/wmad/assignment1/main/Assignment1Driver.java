package ca.ciccc.wmad.assignment1.main;

import ca.ciccc.wmad.assignment1.question4.question4;
import ca.ciccc.wmad.assignment1.question5.question5;

public class Assignment1Driver {
    public static void run () {
        question4 question4Driver = new question4();
        question5 question5Driver = new question5();
        question4Driver.sayHelloWorld();
        question5Driver.circleArea();

    }
}
