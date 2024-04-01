package inflearn2.heesane.xml;

import inflearn2.heesane.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

class XmlAppContextTest {

    @Test
    void xmlAppContext(){
        ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");
        MemberService mc = ac.getBean("memberService", MemberService.class);
        assertThat(mc).isInstanceOf(MemberService.class);
    }
}
