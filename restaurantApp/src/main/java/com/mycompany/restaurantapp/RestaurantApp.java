package com.mycompany.restaurantapp;

import com.mycompany.people.Customer;
import com.mycompany.restaurantapp.food.Dish;
import com.mycompany.restaurantapp.food.Menu;
import com.mycompany.restaurantapp.values.CustomerRoles;
import com.mycompany.restaurantapp.values.DishType;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRoles.STUDENT, "192240", "Anamaria");
        student.sellFood();
        
        Customer administrative = new Customer(CustomerRoles.ADMINISTRATIVE, "sss", "Sultanito de tal");
        administrative.sellFood();
         
        Menu menu = new Menu();
        Dish breakfast1 = new Dish(DishType.BREAKFAST, "Huevos fritos", "Huevos, sal y primienta", 2400, 20);
        Dish breakfast2 = new Dish(DishType.BREAKFAST, "Caldo", "Carne, papa, ajo", 2400, 20);
        Dish lunch1 = new Dish(DishType.LUNCH, "Pastas a la bolognesa ", "Pasta frescas", 2400, 20);
        
        menu.addDish(breakfast1);
        menu.addDish(breakfast2);
        menu.addDish(lunch1);
        
        System.out.println(menu.getDishesPerType(DishType.BREAKFAST));
        
        
    }
}
