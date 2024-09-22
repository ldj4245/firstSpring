package org.leedae.firstspring.order;

import org.leedae.firstspring.discount.DiscountPolicy;
import org.leedae.firstspring.discount.FixDiscountPolicy;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemberRepository;
import org.leedae.firstspring.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member,itemPrice);


        return new Order(memberId, itemName, itemPrice, discountPrice);

    }
}
