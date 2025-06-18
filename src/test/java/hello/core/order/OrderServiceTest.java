package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService  = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();


    @Test
    void createOrder() {
        Member member = new Member(1L,"membera", Grade.vip);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "itema", 10000);

        System.out.println("order = " + order);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);


    }

}
