package com;

import com.models.Drink;
import com.models.Ingredient;

import java.util.HashMap;
import java.util.Map;

public class CoffeeShop {

    public static void main(String[] args) {
	    Ingredient sugar = new Ingredient(5, "sugar");
        Ingredient coffee = new Ingredient(10, "coffee");

        Map<Ingredient, Integer> coffeeWithSugarRecipe = new HashMap<>();
        coffeeWithSugarRecipe.put(sugar, 2);
        coffeeWithSugarRecipe.put(coffee, 1);

        Drink coffeeWithSugar = new Drink(coffeeWithSugarRecipe, 1);

        int answer = coffeeWithSugar.getPrice();
        System.out.println(answer);
    }
}
