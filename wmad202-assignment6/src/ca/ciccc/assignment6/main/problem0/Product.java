package ca.ciccc.assignment6.main.problem0;

public class Product {
    private int productID;
    private String productName;
    private double productPrice;
    private String productMadeInCountry;

    public Product(int productID, String productName, double productPrice, String productMadeInCountry){
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productMadeInCountry = productMadeInCountry;

    }
    public double getProductPrice(){
        return this.productPrice;
    }
    public String getProductName(){
        return this.productName;
    }

}
