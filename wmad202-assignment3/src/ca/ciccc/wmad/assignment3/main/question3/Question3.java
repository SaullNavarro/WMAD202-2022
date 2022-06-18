package ca.ciccc.wmad.assignment3.main.question3;

import java.util.Scanner;

public class Question3 {
      public void shapeInput() {
          Scanner input = new Scanner(System.in);
          System.out.printf("Please enter a number: ");
          int number = input.nextInt();
          System.out.println("Enter a shape,[like, SHAPE1, SHAPE2, SHAPE3]: ");
          String shape = input.next();

          switch (shape) {
              case "SHAPE1" -> printShape1(number);
              case "SHAPE2" -> printShape2(number);
              case "SHAPE3" -> printShape3(number);
          }
      }
      public void printShape1 (int number){
          int blanks = 0;

          for (int i = number; 0 <= i; i-=2){
              for (int i1 = 0; i1 < blanks; i1++){
                  System.out.print(" ");
              }
              for (int j = 0; j < i ; j++ ){
                  System.out.print("*");
              }
              System.out.println();
              blanks++;
          }
      }
      public void printShape2(int number) {
          for (int i = number; 0 <= i; i--){
              for (int j = 0; j < i; j++){
                  System.out.print("*");
              }
              System.out.println();
          }
      }
      public void printShape3(int number){
          for (int i = 1; i < number + 1; i++){
              for (int j = 0; j < i; j++){
                  System.out.print("*");
              }
              System.out.println();
          }
      }
}
