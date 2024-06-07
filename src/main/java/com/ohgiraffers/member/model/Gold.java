package com.ohgiraffers.member.model;

public class Gold extends Member implements Buyable {
    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.05;
    }

    @Override
    public int buy(int price) {

        return (int) (price * 0.95);
    }
}
