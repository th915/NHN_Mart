package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    @DisplayName("Basket 생성 테스트")
    void basketTest(){
        Basket basket = new Basket();

        Assertions.assertEquals(0, basket.getBasketSize());
    }

    @Test
    @DisplayName("Food 객체 추가 테스트")
    void addFooddTest(){
        Basket basket = new Basket();
        basket.add(new Food("양파", 1_000));
        basket.add(new Food("파", 500));

        Assertions.assertEquals("파", basket.getFoods().get(1).getName());
        Assertions.assertEquals(1000, basket.getFoods().get(0).getPrice());
    }
}