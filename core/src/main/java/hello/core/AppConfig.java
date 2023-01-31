package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.RateDiscountPolicy;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(MemberRepository());
    }
    @Bean
    public MemoryMemberRepository MemberRepository() {

        System.out.println("call AppConfig.MemberRepository");
        return new MemoryMemberRepository();
    }
    @Bean
    public OrderService orderService() { //바로 면접 성공 가즈아아아

        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(MemberRepository(),discountPolicy());
    }
    @Bean
    public DiscountPolicy discountPolicy() { //좋은 기업 될놈될!!!!
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

    // 자바공부
    // 스프링 공부
    // 코딩테스트 공부(알고리즘)
    // 기술면접 공부
    // 어차피 인생은 될놈될. 와 근데 진짜 나 안뽑아줄것같은데
}
