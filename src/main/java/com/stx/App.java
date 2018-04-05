package com.stx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.stx.*")
@ServletComponentScan("com.stx*")
@EnableAutoConfiguration(exclude = {     
        org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration.class
})
public class App {
    public static void main( String[] args ){
		SpringApplication.run(App.class, args);
    }
}
