package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountP implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.vip){
            return price = discountFixAmount;
        }else{
            return 0;
        }
    }
}
