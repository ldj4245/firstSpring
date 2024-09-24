package org.leedae.firstspring.autowired;

import jakarta.annotation.Nullable;
import org.junit.jupiter.api.Test;
import org.leedae.firstspring.member.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.text.html.Option;
import java.util.Optional;

public class AutowiredTest {

    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);
    }

    static class TestBean{

        @Autowired(required = false)
        public void setNoBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);

        }

        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean1 = " + noBean2);

        }

        @Autowired
        public void setNoBean3(Optional<Member> noBnea3){
            System.out.println("noBnea3 = " + noBnea3);

        }

    }
}
