package com.nhnacademy.mart;

public class Counter {

    private int money;

    private int price = 0;

    public Counter(){
        this.money = 20000;
        this.price = 0;
    }

    public int getPrice() { return price; }
    public int getMoney() {
        return money;
    }

    // TODO pay 메서드 구현 (카운터에서 계산 처리 메서드)

    public static void pay( Basket basket , Counter counter, BuyList buyList){
        for (int i = 0; i < basket.getBasketSize(); i++){
            counter.price += basket.getFoods().get(i).getPrice()*buyList.getItems().get(i).getAmount();
        }
        counter.money = counter.money - counter.price;

        if(counter.money < 0){
            throw new RuntimeException("돈을 초과하였습니다.");
        }
    }

}
