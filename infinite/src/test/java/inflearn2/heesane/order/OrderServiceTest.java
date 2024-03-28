package inflearn2.heesane.order;

import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.member.MemberServiceImpl;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        //given
        Member member = new Member(1L,"heesane", Grade.VIP);

        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }
}
