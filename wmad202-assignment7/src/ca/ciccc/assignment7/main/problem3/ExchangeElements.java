package ca.ciccc.assignment7.main.problem3;

import java.util.ArrayList;

public class ExchangeElements {
    public static <E> ArrayList<E> exchangeElements (ArrayList<E> list, int pos1, int pos2){
        E pos1Val = list.get(pos1);
        E pos2val = list.get(pos2);

        list.set(pos2, pos1Val);
        list.set(pos1, pos2val);
        return list;
    }
}
