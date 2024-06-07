package kr.ac.hansung.cse.hellospringboot;

import kr.ac.hansung.cse.hellospringboot.service.MyService;

import org.springframework.boot.SpringApplication;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/* 아래 코드가 없으면 HelloSpringBootApplication가 속한 패키지만 전부 스캔하기 때문에
    예를 들어 다른 패키지(kr.ac.hansung.ecse)에 있는 Product라는 컴포넌트는
    @Component를 사용해도 빈으로 등록되지 않음
 */
@ComponentScan(basePackages = {"kr.ac.hansung.cse", "kr.ac.hansung.ecse"})
public class HelloSpringBootApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                 SpringApplication.run(HelloSpringBootApplication.class, args);

        MyService myService = context.getBean(MyService.class);

        System.out.println(myService.getMessage());
    }

}
