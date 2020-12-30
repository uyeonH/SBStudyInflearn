package hello.core;

import com.sun.source.tree.MemberSelectTree;
import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;

public class MemberApp {
    // 단축키 psvm
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); // 단축키 Ctrl + Alt + V
        memberService.join(member);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);

        System.out.println("newMember = " + member.getName());
        System.out.println("findMember = " + findMember.getName());
    }


}
