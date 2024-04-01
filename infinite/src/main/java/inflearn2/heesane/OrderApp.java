package inflearn2.heesane;

import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;
import inflearn2.heesane.member.MemberService;
import inflearn2.heesane.order.Order;
import inflearn2.heesane.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = applicationContext.getBean("memberService",MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId,"heesane",Grade.VIP);

        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 20000);
        System.out.println("order = "+ order);
    }
}
