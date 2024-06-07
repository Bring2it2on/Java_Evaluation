package com.ohgiraffers.member.model;

public interface Buyable {
    public int price = 0;

    public abstract int buy(int price);

}
