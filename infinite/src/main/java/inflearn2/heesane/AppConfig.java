package inflearn2.heesane;

import inflearn2.heesane.discount.DiscountPolicy;
import inflearn2.heesane.discount.RateDiscountPolicy;
import inflearn2.heesane.member.MemberRepository;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.member.MemberServiceImpl;
import inflearn2.heesane.member.MemoryMemberRepository;
import inflearn2.heesane.order.OrderService;
import inflearn2.heesane.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }
}
