package hello.core.singleton;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

import static org.junit.jupiter.api.Assertions.*;

class StatefulServiceTest {

    @Test
    void statefulServiceSingleton() {

        ApplicationContext ac = new AnnotationConfigApplicationContext(TestCongig.class);
        StatefulService statefulService = ac.getBean(StatefulService.class);
        StatefulService statefulService2 = ac.getBean(StatefulService.class);

        // Thread A : A 사용자 10,000원 주문
        int userAPrice = statefulService.order("userA", 10000);
        int userBPrice = statefulService2.order("userB", 20000);

        // Thread A: 사용자 A  주문 금액 조회
        //System.out.println("price: " + price);

        Assertions.assertThat(userAPrice).isEqualTo(10000);
    }

    static class TestCongig {
        @Bean
        public StatefulService statefulService() {
            return new StatefulService();
        }

    }
}