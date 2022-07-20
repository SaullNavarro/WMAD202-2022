package ca.ciccc.assignment7.main;

import ca.ciccc.assignment7.main.problem1.TestCounter;
import ca.ciccc.assignment7.main.problem3.TestExchangeElement;

public class Assignment7Driver {
    public static void run(){
        TestCounter testCounter = new TestCounter();
        testCounter.test();

        TestExchangeElement.run();

    }

}
