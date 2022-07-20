package ca.ciccc.assignment6.main;

import ca.ciccc.assignment6.main.problem0.Product;
import ca.ciccc.assignment6.main.problem1.Cloth;
import ca.ciccc.assignment6.main.problem1.Drink;
import ca.ciccc.assignment6.main.problem1.Food;
import ca.ciccc.assignment6.main.problem1.Materials;
import ca.ciccc.assignment6.main.problem2.Cart;
import ca.ciccc.assignment6.main.problem2.ShoppingCart;

import java.util.ArrayList;

public class Assignment6Driver {
    public static void run() {
        Product dietPepsi = new Product(110, "Diet Pepsi", 2, "USA");
        ArrayList<String> sushiIngredients = new ArrayList<>();
        sushiIngredients.add("Rice");
        sushiIngredients.add("Avocado");
        sushiIngredients.add("Seaweed");
        Food sushiRoll = new Food(777, "California Roll", 4.99, "Japan", 436, 10, sushiIngredients);
        ArrayList<Materials> tShirtMaterials = new ArrayList<>();
        tShirtMaterials.add(new Materials(10, "Nylon"));
        Cloth tShirt = new Cloth(701, "TShirt", 15, "China", tShirtMaterials);

        System.out.println("-----Problem2-----");
        System.out.println("-(: Thank you for shopping with us :)-");

        Drink pepsi1 = new Drink(412, "Pepsi", 2, "USA", false, 150);
        Drink pepsi2 = new Drink(412, "Pepsi", 2, "USA", false, 150);
        Drink pepsi3 = new Drink(412, "Pepsi", 2, "USA", false, 150);
        Drink gingerZero = new Drink(183, "Ginger Zero", 3, "Canada", true, 200);
        ArrayList<String> chickenIngredients = new ArrayList<>();
        chickenIngredients.add("Chicken");
        chickenIngredients.add("Oil");
        chickenIngredients.add("Cheese");
        Food chicken = new Food(100, "Chicken", 8, "Canada", 350, 4, chickenIngredients);
        ArrayList<String> chickenIngredients2 = new ArrayList<>();
        chickenIngredients.add("Chicken");
        chickenIngredients.add("Oil");
        chickenIngredients.add("Cheese");
        Food chicken2 = new Food(100, "Chicken", 8, "Canada", 350, 4, chickenIngredients);
        ArrayList<String> pastaIngredients = new ArrayList<>();
        pastaIngredients.add("Pasta");
        pastaIngredients.add("Meat");
        pastaIngredients.add("Spinach");
        Food pasta = new Food(101, "Pasta", 18, "Canada", 250, 3, pastaIngredients);
        ArrayList<String> pastaIngredients2 = new ArrayList<>();
        pastaIngredients.add("Pasta");
        pastaIngredients.add("Meat");
        pastaIngredients.add("Spinach");
        Food pasta2 = new Food(101, "Pasta", 18, "Canada", 250, 3, pastaIngredients);
        ArrayList<Materials> tShirt2Material = new ArrayList<>();
        tShirt2Material.add(new Materials(10, "Nylon"));
        Cloth tShirt2 = new Cloth(701, "T-Shirt", 15, "China", tShirt2Material);

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addItem(pepsi1);
        shoppingCart.addItem(pepsi2);
        shoppingCart.addItem(pepsi3);
        shoppingCart.addItem(gingerZero);
        shoppingCart.addItem(chicken);
        shoppingCart.addItem(chicken2);
        shoppingCart.addItem(pasta);
        shoppingCart.addItem(pasta2);
        shoppingCart.addItem(tShirt2);
        shoppingCart.printReceipt();
        System.out.println(shoppingCart.calculateTotalAmount());
    }

}
