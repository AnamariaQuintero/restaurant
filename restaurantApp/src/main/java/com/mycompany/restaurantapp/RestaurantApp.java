package com.mycompany.restaurantapp;

import people.Customer;
import values.CustomerRoles;

public class RestaurantApp {

    public static void main(String[] args) {
        Customer student = new Customer(CustomerRoles.STUDENT, "192240", "Anamaria");
        student.sellFood();
        
         Customer administrative = new Customer(CustomerRoles.ADMINISTRATIVE, "sss", "Sultanito de tal");
         administrative.sellFood();
    }
}
