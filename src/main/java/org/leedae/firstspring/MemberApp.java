package org.leedae.firstspring;

import org.leedae.firstspring.member.Grade;
import org.leedae.firstspring.member.Member;
import org.leedae.firstspring.member.MemberService;
import org.leedae.firstspring.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {

        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);


        Member findMember = memberService.findMember(1L);
        System.out.println("new member  = " + member.getName());
        System.out.println("findMember = " + findMember.getName());


    }

}