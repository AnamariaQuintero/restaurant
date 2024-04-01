package com.mycompany.restaurantapp.food;

import com.mycompany.restaurantapp.values.CustomerRoles;
import com.mycompany.restaurantapp.values.DishType;
import java.util.ArrayList;

public class Menu {
    private ArrayList<Dish> dishList;

    public Menu() {
        this.dishList = new ArrayList<>();
    }
    
    public Menu(ArrayList<Dish> dishList) {
        this.dishList = dishList;
    }
    
    public void addDish(Dish dish) {
        this.dishList.add(dish);
    }
    
    public ArrayList<String> getDishesPerType(DishType dishType){
        // ArrayList<Dish> foundDishes = new ArrayList<>();
        ArrayList<String> foundDishes = new ArrayList<>();
        
        for (Dish dish : dishList){
            if(dish.getType() == dishType){
                foundDishes.add(dish.getName());
            }
        }
        
        return foundDishes;
    }
    
    public void showMenu(){
        
        for (DishType dishType: DishType.values()){
            ArrayList<String> dishes = getDishesPerType(dishType);
            System.out.println("*** --- " + dishType  + " --- ***");
            for(String dish : dishes){
             System.out.println(dish);
            } 
        }
       
    }
    
    public void showPrice() {
        final double priceStudent = 2400;
        System.out.println("--- *** LISTA DE PRECIOS *** ---");
        for (CustomerRoles price : CustomerRoles.values()){
            System.out.println("*** --- " + price + " --- ***");
            
        }
    }
    
}