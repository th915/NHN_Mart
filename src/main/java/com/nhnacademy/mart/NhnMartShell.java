package com.nhnacademy.mart;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();  // 마트를 만듬
        mart.prepareMart();

        // 구매 리스트 생성
        BuyList buyList = inputBuyListFromShell();

        // TODO 본인이름 영어로 변수명 작성!
        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer taeHee = new Customer(buyList);

        // 장바구니를 챙긴다.
        taeHee.bring(mart.provideBasket());

        // 식품을 담는다.
        taeHee.pickFoods(mart.getFoodStand());

        // 카운터에서 계산한다.
        taeHee.payTox(mart.getCounter());
    }

    // 양파 2 계란 2 파 4
    // 총 가격은 14000원 입니다.
    // 고객님 결제 후 잔액 : 6000


    private static BuyList inputBuyListFromShell() {
        // TODO Scanner 입력을 받아 buyList 만들기
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int amount = 0;

        BuyList buyList = new BuyList();

        String item = scanner.nextLine();
        String[] itemList = item.split("\\s");

        for(int i = 0; i < itemList.length; i += 2){

            name = itemList[i];
            amount = Integer.parseInt(itemList[i+1]);

            buyList.add(new BuyList.Item(name, amount));
        }
        return buyList;
    }
}
