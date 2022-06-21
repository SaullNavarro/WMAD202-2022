package ca.ciccc.wmad.assignment3.main.question8;
import java.util.Scanner;
import java.util.ArrayList;

public class Question8 {
    public static void topLimit(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter topLimit: ");
        int topLimit = in.nextInt();

        if (topLimit < 40 || 100 < topLimit) {
            System.out.println("You should enter a topLimit between 40 and 100");
            return;
        }
        System.out.print("Please enter a number: ");
        int number = in.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 2; i <= topLimit; i++) {
            if (i % number == 0) result.add(i);
        }

        System.out.printf("%s\n", result);
    }
}
