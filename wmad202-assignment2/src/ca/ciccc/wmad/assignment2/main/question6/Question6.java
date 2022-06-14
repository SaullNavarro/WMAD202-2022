package ca.ciccc.wmad.assignment2.main.question6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Question6 {

    public void OneAlphabeticVariables() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter arithmetic statement: ");
        String statement = in.next();

        if (OneAlphabeticVariables(statement)) {
            System.out.printf("%s is a valid statement.\n", statement);
        } else {
            System.out.printf("%s is NOT a valid statement.\n", statement);
        }

    }

    private boolean OneAlphabeticVariables(String s) {
        ArrayList<Character> operations = new ArrayList<>(5);
        operations.add('+');
        operations.add('-');
        operations.add('*');
        operations.add('/');
        operations.add('%');

        boolean validChar = true;
        int openParentheses = 0;
        int closedParentheses = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = toString().charAt(i);
            if (c == '(') {
                openParentheses++;
                continue;
            }
            if (c == ')') {
                closedParentheses++;
                continue;
            }
            if (Character.isAlphabetic(c) || operations.contains(c)) {
                continue;
            }
            validChar = false;

        }

        return openParentheses == closedParentheses && validChar;
    }
}
