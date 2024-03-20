package hhs.study.javaspr;

import hhs.study.javaspr.aop.TimeTraceAop;
import hhs.study.javaspr.repository.JdbcMemberRepository;
import hhs.study.javaspr.repository.MemberRepository;
import hhs.study.javaspr.repository.MemoryMemberRepository;
import hhs.study.javaspr.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }
    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new JdbcMemberRepository(dataSource);
    }
}
