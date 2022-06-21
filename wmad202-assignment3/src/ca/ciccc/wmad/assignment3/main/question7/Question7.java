package ca.ciccc.wmad.assignment3.main.question7;
import java.util.Scanner;
import java.util.ArrayList;

public class Question7 {
    public void linearSearch(){
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.format("Please enter a number: ");
        while (scan.hasNextInt()) {
            int nextNumber = scan.nextInt();
            numbers.add(nextNumber);
            System.out.format("Please enter a number: ");
        }

        Scanner in = new Scanner(System.in);
        System.out.format("Enter target number: ");
        int targetNumber = in.nextInt();
        System.out.format("Target number index is %d\n", findTargetIndex(numbers, targetNumber));
    }

    private int findTargetIndex(ArrayList<Integer> numbers, int targetNumber) {
        for (int i = 0; i < numbers.size(); i++) {
            if (targetNumber == numbers.get(i)) return i;
        }

        return -1;
    }
}
