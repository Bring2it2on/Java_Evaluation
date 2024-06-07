package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    private List<Member> memberList = new ArrayList<>(10);

    public MemberRepository() {
    }

    public void insertMember(Member m) throws OverMemberException {
        if(memberList.size() < 10){
            memberList.add(m);
        } else{
            throw new OverMemberException("Member List is full");
        }

    }

    public void printData() {
        try{
            for(Member m: memberList){
                System.out.println(m.getGrade()+ " 등급 회원 " + m.getName()
                        + "의 포인트는 " + m.getPoint() + "이고, 이자 포인트는 " + m.calculateInterest() + "입니다.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    public void printBuyInfo(int price){
        try{
            for(Member m: memberList){
                System.out.println(m.getGrade()+ " 등급 회원 " + m.getName()
                        + "는 " + price + "원 상품을 " + m.buy(price) + "원에 구매합니다.");
            }
        } catch(Exception e){
            e.printStackTrace();
        }


    }

}
