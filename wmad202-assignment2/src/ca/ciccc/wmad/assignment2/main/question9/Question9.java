package ca.ciccc.wmad.assignment2.main.question9;
import java.util.Scanner;

public class Question9 {
    public void test() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = in.nextLine();

        while (isAlpha(name)) {
            System.out.printf("%s\n", name.toUpperCase());
            System.out.print("Enter a name: ");
            name = in.nextLine();
        }
    }

    private boolean isAlpha(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }

        return true;
    }
}
