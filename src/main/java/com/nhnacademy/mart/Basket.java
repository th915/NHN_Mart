package com.nhnacademy.mart;

import java.util.ArrayList;

public class Basket {

    private final ArrayList<Food> foods = new ArrayList<>();

    public ArrayList<Food> getFoods() {
        return foods;
    }
    public int getBasketSize(){
        return foods.size();
    }

    public void add(Food food) {
        foods.add(food);
    }
}
