package com.ohgiraffers.member.model;

public class Gold extends Member {
    public Gold(String name, String grade, int point) {
        super(name, grade, point);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() * 0.05;
    }
}
