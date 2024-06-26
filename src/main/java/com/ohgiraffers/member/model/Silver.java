package com.ohgiraffers.member.model;

public class Silver extends Member implements Buyable{

    public Silver(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.02;
    }

    @Override
    public int buy(int price) {

        return (int) (price * 0.98);
    }


}
