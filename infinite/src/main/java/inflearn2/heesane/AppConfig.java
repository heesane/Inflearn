package inflearn2.heesane;

import inflearn2.heesane.discount.DiscountPolicy;
import inflearn2.heesane.discount.RateDiscountPolicy;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.member.MemberServiceImpl;
import inflearn2.heesane.member.MemoryMemberRepository;
import inflearn2.heesane.order.OrderService;
import inflearn2.heesane.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(MemberRepository());
    }

    private MemoryMemberRepository MemberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService(){
        return new OrderServiceImpl(MemberRepository(), discountPolicy());
    }

    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
