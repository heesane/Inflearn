package inflearn2.heesane.discount;

import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price){
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }
        else return 0;
    }
}
