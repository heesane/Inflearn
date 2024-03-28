package inflearn2.heesane;

import inflearn2.heesane.discount.FixDiscountPolicy;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.member.MemberServiceImpl;
import inflearn2.heesane.member.MemoryMemberRepository;
import inflearn2.heesane.order.OrderService;
import inflearn2.heesane.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
