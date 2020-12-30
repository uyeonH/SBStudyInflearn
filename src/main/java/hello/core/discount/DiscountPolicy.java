package hello.core.discount;

import hello.core.Member.Member;

public interface DiscountPolicy {

    /**
     *
     * @param member
     * @param price
     * @return 할인 대상 금액액     */

    int discount(Member member, int price); // 단축키 F2 오류 발생 지점으로 이동

}
