package ca.ciccc.assignment7.main.problem3;

import java.util.ArrayList;

public class TestExchangeElement {
    public static void run(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(ExchangeElements.exchangeElements(list, 0,4));
    }
}
