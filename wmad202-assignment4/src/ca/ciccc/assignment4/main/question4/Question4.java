package ca.ciccc.assignment4.main.question4;

/*Write a method which receives a list and returns a number. In the list, all numbers have
been repeated twice except one number that is repeated once. The method should return
the number that is repeated once and return it.*/
import java.util.Arrays;
import java.util.Scanner;
import java.util.HashMap;

public class Question4 {
    public void findSingleNumber() {
        Scanner in = new Scanner(System.in);
        HashMap<Integer, Integer> numbers = new HashMap<>();

        System.out.format("Enter a number: ");
        while (in.hasNextInt()) {
            int nextNumber = in.nextInt();
            if (numbers.containsKey(nextNumber)) {
                numbers.remove(nextNumber);
            } else {
                numbers.put(nextNumber, 1);
            }
            System.out.format("Enter a number: ");
        }

        System.out.printf("%s is not repeated.\n", Arrays.toString(numbers.keySet().toArray()));
    }
}

