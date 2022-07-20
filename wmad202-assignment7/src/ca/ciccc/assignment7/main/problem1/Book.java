package ca.ciccc.assignment7.main.problem1;

public class Book implements Specificable{
    private String Author;
    private String Category;
    private int NumberOfPages;

    public Book(String Author, String Category, int NumberOfPages){
        this.Author = Author;
        this.Category = Category;
        this.NumberOfPages = NumberOfPages;
    }
    @Override
    public boolean hasSpecificProperty() {
        return this.Category.equals("Sci-Fi");
    }
}
