package inflearn2.heesane.discount;

import inflearn2.heesane.member.Grade;
import inflearn2.heesane.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10% 할인이 적용되어야 한다.")
    public void discount(){
        Member member = new Member(1L, "heesane", Grade.VIP);

        int discountPrice = discountPolicy.discount(member, 10000);

        assertThat(discountPrice).isEqualTo(1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
    public void discount2(){
        Member member = new Member(2L, "heesane", Grade.BASIC);

        int discountPrice = discountPolicy.discount(member, 10000);

        assertThat(discountPrice).isEqualTo(0);
    }
}