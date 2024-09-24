package org.leedae.firstspring;

import org.leedae.firstspring.discount.DiscountPolicy;
import org.leedae.firstspring.discount.FixDiscountPolicy;
import org.leedae.firstspring.discount.RateDiscountPolicy;
import org.leedae.firstspring.member.MemberRepository;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemberServiceImpl;
import org.leedae.firstspring.member.MemoryMemberRepository;
import org.leedae.firstspring.order.OrderService;
import org.leedae.firstspring.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(memberRepository());
    }


    @Bean
    public MemberRepository memberRepository(){
        System.out.println("call 2AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call3 AppConfig.orderService");
        return new OrderServiceImpl(memberRepository(), discountPolicy());
//        return null;

    }


    @Bean
    public DiscountPolicy discountPolicy(){
        return new RateDiscountPolicy();
    }


}
