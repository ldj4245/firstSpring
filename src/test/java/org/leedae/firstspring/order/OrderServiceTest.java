package org.leedae.firstspring.order;

import org.junit.jupiter.api.Test;
import org.leedae.firstspring.discount.DiscountPolicy;
import org.leedae.firstspring.discount.FixDiscountPolicy;
import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemberServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

public class OrderServiceTest {
    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();


    @Test
    void orderTest(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
