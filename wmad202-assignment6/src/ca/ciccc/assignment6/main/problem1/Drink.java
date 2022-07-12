package ca.ciccc.assignment6.main.problem1;

import ca.ciccc.assignment6.main.problem0.Product;

public class Drink extends Product {
    private int drinkID;
    private String drinkName;
    private float drinkPrice;
    private String drinkMadeInCountry;
    private boolean isDrinkDiet;
    private int drinkSize;

    public Drink(int productID, String productName, float productPrice, String productMadeInCountry, boolean isDrinkDiet, int drinkSize) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.drinkID = productID;
        this.drinkName = productName;
        this.drinkPrice = productPrice;
        this.drinkMadeInCountry = productMadeInCountry;
        this.isDrinkDiet = isDrinkDiet;
        this.drinkSize = drinkSize;
    }
}
