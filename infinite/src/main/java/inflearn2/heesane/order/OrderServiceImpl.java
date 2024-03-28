package inflearn2.heesane.order;

import inflearn2.heesane.discount.DiscountPolicy;
import inflearn2.heesane.discount.FixDiscountPolicy;
import inflearn2.heesane.discount.RateDiscountPolicy;
import inflearn2.heesane.member.Member;
import inflearn2.heesane.member.MemberRepository;
import inflearn2.heesane.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId,itemName, itemPrice, discountPrice);
    }
}
