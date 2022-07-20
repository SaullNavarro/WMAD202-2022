package ca.ciccc.assignment7.main.problem1;

import java.util.ArrayList;

public class TestCounter {
    public static void test() {
        Account account1 = new Account(9892, "Yoshi", 0.0);
        Book book1 = new Book("Alper", "Comedy", 69);
        Student student1 = new Student("Saul", "Programming", 0);
        Account account2 = new Account(0000, "Alper", 69.69);
        Book book2 = new Book("Yoshi", "Computer Science", 876);
        Student student2 = new Student("Yoshi", "Programming", 5.0);
        Account account3 = new Account(9281, "Saul", 103207931);
        Book book3 = new Book("Saul", "Sci-Fi", 320);
        Student student3 = new Student("Alper", "Programming", 3.0);
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        Counter<Student> studentCounter = new Counter<>(students);
        System.out.println("Students with GPA > 4: " + studentCounter.countNumberOfElementsWithSpecificProperty());
        Counter<Book> bookCounter = new Counter<>(books);
        System.out.println("Category - Sci-Fi books: " + bookCounter.countNumberOfElementsWithSpecificProperty());
        Counter<Account> accountCounter = new Counter<>(accounts);
        System.out.println("Clients with 100,000+: " + accountCounter.countNumberOfElementsWithSpecificProperty());

    }
}

