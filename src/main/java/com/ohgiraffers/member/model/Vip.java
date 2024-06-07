package com.ohgiraffers.member.model;

public class Vip extends Member{
    public Vip(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.1;
    }
}
