package org.leedae.firstspring.order;

import org.junit.jupiter.api.Test;
import org.leedae.firstspring.discount.FixDiscountPolicy;
import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemoryMemberRepository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder(){
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L,"Lee", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L,"itemA",10000);
        assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }

}