package ca.ciccc.assignment7.main.problem1;

import java.util.ArrayList;

public class Counter<E extends Specificable> {
    private ArrayList<E> objects;
    public Counter(ArrayList<E>objects){this.objects = objects;}

    public int countNumberOfElementsWithSpecificProperty() {
        int count = 0;

        for (E object: this.objects){
            if (object.hasSpecificProperty()){
                count++;
            }
        }
        return count;
    }

}
