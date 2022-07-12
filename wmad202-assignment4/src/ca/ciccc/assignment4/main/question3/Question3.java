package ca.ciccc.assignment4.main.question3;
/*Design and implement a method which has one input parameter which is a number which
is greater than 50, called num. Then the method will create a dictionary whose keys are 2
and 3 and 4 and 5 and 6 and 7 and 8 and 9. Then the method calculates the values for
each of the above keys. The value for a key is all the numbers between 2 and input “num”
that are divisible by the key. The method eventually will print the result. Example: num = 20 2: [2,4,6,8,10,12,14,16,18,20]
3: [3,6,9,12,15,18] 4: [4,8,12,16,20] 5: [5,10,15,20] 6: [6,12,18] 7: [7, 14] 8: [8, 16] 9: [9, 18]*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Question3 {
    public void greaterThanFifty() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number > 50: ");
        int num = input.nextInt();
        if (num <= 50) {
            System.out.println("Invalid number, please enter a number greater than 50: ");
            return;
        }
        HashMap<Integer, ArrayList<Integer>> division = divisibleList(num);
        for (Integer key : division.keySet()){
            System.out.printf("%d: %s\n", key, division.get(key));
        }
    }

    //Creating method for dictionary
    private HashMap<Integer, ArrayList<Integer>> divisibleList(int num){
        HashMap<Integer, ArrayList<Integer>> division = new HashMap<>();

        // adding keys and values of list
        for (int i = 2; i <= 9; i++) {
            division.put(i, new ArrayList<>());
        }
        //Getting numbers divisible by key
        for (int i = 2; i <= 9 ; i++) {
            for (int j = i; j <= num ; j++) {
                if (j % i == 0){
                   division.get(i).add(j);
                }
            }
        }
        return division;
    }
}