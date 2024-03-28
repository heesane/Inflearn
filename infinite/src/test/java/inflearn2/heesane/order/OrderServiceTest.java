package inflearn2.heesane.order;

import inflearn2.heesane.AppConfig;
import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;
import inflearn2.heesane.member.MemberService;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
        orderService = appConfig.orderService();
    }

    @Test
    void createOrder(){
        //given
        Member member = new Member(1L,"heesane", Grade.VIP);

        //when
        memberService.join(member);
        Order order = orderService.createOrder(1L, "itemA", 10000);

        //then
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
