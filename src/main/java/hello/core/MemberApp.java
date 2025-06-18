package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.cglib.core.VisibilityPredicate;

public class MemberApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member membera = new Member(1L, "membera", Grade.vip);

        memberService.join(membera);

        Member fideMember = memberService.findMember(1L);
        System.out.println("fideMember = " + fideMember.getName());
        System.out.println("membera = " + membera.getName());
    }

}
