package org.leedae.firstspring;

import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemberServiceImpl;
import org.leedae.firstspring.order.Order;
import org.leedae.firstspring.order.OrderService;
import org.leedae.firstspring.order.OrderServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

    public static void main(String[] args) {


        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
        OrderService orderService = applicationContext.getBean("orderService",OrderService.class);

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);


        System.out.println("order = " + order);

    }
}
