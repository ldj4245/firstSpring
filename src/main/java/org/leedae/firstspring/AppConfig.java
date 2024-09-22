package org.leedae.firstspring;

import org.leedae.firstspring.discount.DiscountPolicy;
import org.leedae.firstspring.discount.RateDiscountPolicy;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemberServiceImpl;
import org.leedae.firstspring.member.MemoryMemberRepository;
import org.leedae.firstspring.order.OrderService;
import org.leedae.firstspring.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new RateDiscountPolicy());
    }


}
