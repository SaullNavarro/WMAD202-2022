package ca.ciccc.assignment6.main.problem1;
import ca.ciccc.assignment6.main.problem0.Product;
import java.util.ArrayList;
public class Food extends Product {
    private int foodID;
    private String foodName;
    private double foodPrice;
    private String foodMadeInCountry;
    private int foodCalories;
    private int foodSize;
    private ArrayList<String> foodIngredients;
    public Food(int productID, String productName, double productPrice, String productMadeInCountry, int foodCalories, int foodSize, ArrayList foodIngredients) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.foodID = productID;
        this.foodName = productName;
        this.foodPrice = productPrice;
        this.foodMadeInCountry = productMadeInCountry;
        this.foodCalories = foodCalories;
        this.foodSize = foodSize;
        this.foodIngredients = foodIngredients;
    }
}
