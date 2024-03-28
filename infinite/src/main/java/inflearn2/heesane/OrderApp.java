package inflearn2.heesane;

import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.member.MemberServiceImpl;
import inflearn2.heesane.order.Order;
import inflearn2.heesane.order.OrderService;
import inflearn2.heesane.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId,"heesane",Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        System.out.println("order = "+ order);
    }
}
