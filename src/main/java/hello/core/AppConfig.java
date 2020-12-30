package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

/* 의존관계 주입 역할
* 역할과 구현 클래스가 한 눈에 들어온다.
* 애플리케이션 전체 구성을 빠르게 파악할 수 있다.
* */

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    // Repository 변경시 이 부분만 수정해주면 된다.
    private MemoryMemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), new FixDiscountPolicy());
    }

    // 할인 정책을 변경할 경우 이 부분만 변경해주면 된다.
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

}
