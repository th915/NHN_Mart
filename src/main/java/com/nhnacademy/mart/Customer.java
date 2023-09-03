package com.nhnacademy.mart;

import java.lang.module.Configuration;

public class Customer {

    // 고객 구매 목록
    private final BuyList buyList;

    // 고객 장바구니
    private Basket basket;

    public Customer(BuyList buyList) {
        this.buyList = buyList;
    }

    // 장바구니 챙기기
    public void bring(Basket basket) {
        this.basket = basket;
    }


    // TODO pickFoods 메서드 구현
    public void pickFoods(FoodStand foodStand) {
        boolean stock = false;

        for (int i=0; i < buyList.getItemsSize(); i++){
                for(int j = 0; j < foodStand.getFoodSize(); j++){
                    if((buyList.getItems().get(i).getName()).equals(foodStand.getFoods().get(j).getName())){
                        basket.add(foodStand.getFoods().get(j));
                        foodStand.remove(foodStand.getFoods().get(i));
                        stock = true;
                        break;
                    }
                    if(j == foodStand.getFoodSize()-1 && !stock){
                        throw  new RuntimeException("식품 매대에 없는 상품입니다.");
                    }
                }
                if(!stock){
                    throw new RuntimeException("재고가 없습니다.");
                }
            }
    }


    // TODO payTox 메서드 구현
    public void payTox(Counter counter) {
        Counter.pay(basket, counter, buyList);
        System.out.println("총 가격은 " + counter.getPrice() + "원 입니다.");
        System.out.println("고객님 결제 후 잔액 : " + counter.getMoney());
    }


}
