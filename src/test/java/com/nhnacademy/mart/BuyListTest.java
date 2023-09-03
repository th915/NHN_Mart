package com.nhnacademy.mart;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BuyListTest {

    @Test
    @DisplayName("객체 생성 테스트")
    void buyListTest(){
        BuyList buyList = new BuyList();

        Assertions.assertEquals(0, buyList.getItemsSize());
    }

    @Test
    @DisplayName("객체 추가 테스트")
    void addTest(){
        BuyList buyList = new BuyList();
        buyList.add(new BuyList.Item("사과", 3));

        Assertions.assertEquals("사과", buyList.getItems().get(0).getName());
        Assertions.assertEquals(3, buyList.getItems().get(0).getAmount());
    }
}