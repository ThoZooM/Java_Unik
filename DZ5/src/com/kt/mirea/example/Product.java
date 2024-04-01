package com.kt.mirea.example;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author НР
 */
public class Product implements Serializable {
    private long code;
    private String name;
    private String type;
    private boolean isDiscount;
    private ArrayList<String> ingredients;
    private double price;

    private static final long serialVersionUID = -3536693998646060163L;

    public Product(long code, String name, String type, boolean isDiscount, ArrayList<String> ingredients, double price) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.isDiscount = isDiscount;
        this.ingredients = ingredients;
        this.price = price;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIsDiscount(boolean isDiscount) {
        this.isDiscount = isDiscount;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isIsDiscount() {
        return isDiscount;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{code = "  + "; name = " + this.name +
                "; isDiscount = " + isIsDiscount() +
                //"; ingredients = " + getIngredients().toString() +
                "; price = " + getPrice() + "}";
    }
}
