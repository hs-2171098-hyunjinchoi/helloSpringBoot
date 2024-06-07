package kr.ac.hansung.cse.hellospringboot.configuration;

import kr.ac.hansung.cse.hellospringboot.service.MyService;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class MyConfiguration {

    private String professor;
    private String course;

    @Bean
    public MyService myService() {
        return new MyService();
    }
}
