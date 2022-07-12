package ca.ciccc.assignment6.main.problem1;

import ca.ciccc.assignment6.main.problem0.Product;

import java.util.ArrayList;

public class Cloth extends Product {
    int clothId;
    String clothName;
    float clothPrice;
    String clothMadeInCountry;
    ArrayList<Materials> clothMaterials;

    public Cloth(int productID, String productName, float productPrice, String productMadeInCountry, ArrayList<Materials> clothMaterials) {
        super(productID, productName, productPrice, productMadeInCountry);
        this.clothId = productID;
        this.clothName = productName;
        this.clothPrice = productPrice;
        this.clothMadeInCountry = productMadeInCountry;
        this.clothMaterials = clothMaterials;
    }
}
