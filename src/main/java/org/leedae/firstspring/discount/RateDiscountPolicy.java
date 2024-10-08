package org.leedae.firstspring.discount;

import org.leedae.firstspring.annotation.MainDiscountPolicy;
import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
public class RateDiscountPolicy implements DiscountPolicy  {

    private int discountPercent = 10 ;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent /100;
        }else{
            return 0;
        }
    }
}
