package com.ohgiraffers.member.model;

public class Member implements Buyable {
    private String name;
    private String grade;
    private int point;

    public Member(String name, String grade, int point) {
        this.name = name;
        this.grade = grade;
        this.point = point;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public double calculateInterest() {
        return point;
    }

    @Override
    public int buy(int price) {
        return 0;
    }
}
