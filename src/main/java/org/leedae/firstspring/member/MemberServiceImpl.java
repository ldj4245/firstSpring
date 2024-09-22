package org.leedae.firstspring.member;

public class MemberServiceImpl implements MemberService {


    //dip 위반 곧 변경 예정
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
