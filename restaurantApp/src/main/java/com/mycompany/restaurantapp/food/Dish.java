package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.DishType;

public class Dish {
    private DishType type;
    private String name;
    private String ingredients; //TODO: Convertir a una lista
    private int price;
    private int qty;

    public Dish(DishType type, String name, String ingredients, int price, int qty) {
        this.type = type;
        this.name = name;
        this.ingredients = ingredients;
        this.price = price;
        this.qty = qty;
    }

    public DishType getType() {
        return this.type;
    }

    public String getName() {
        return name;
    }
     
    
}
