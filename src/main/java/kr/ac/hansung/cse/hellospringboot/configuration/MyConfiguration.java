package kr.ac.hansung.cse.hellospringboot.configuration;

import kr.ac.hansung.cse.hellospringboot.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
