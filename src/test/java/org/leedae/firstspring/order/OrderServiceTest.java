package org.leedae.firstspring.order;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.leedae.firstspring.AppConfig;
import org.leedae.firstspring.discount.FixDiscountPolicy;
import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemoryMemberRepository;

import static org.assertj.core.api.Assertions.assertThat;

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
    void orderTest(){
        //given
        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId,"itemA",10000);

        assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }


}
