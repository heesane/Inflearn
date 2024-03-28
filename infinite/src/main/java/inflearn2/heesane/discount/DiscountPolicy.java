package inflearn2.heesane.discount;

import inflearn2.heesane.member.Member;

public interface DiscountPolicy {
    /*
     * @return 할인 대상 금액
     */
    int discount(Member member, int price);


}
