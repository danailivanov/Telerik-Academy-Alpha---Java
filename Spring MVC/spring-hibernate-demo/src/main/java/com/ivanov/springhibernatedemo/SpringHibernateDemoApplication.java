package com.ivanov.springhibernatedemo;

import com.ivanov.springhibernatedemo.models.Employee;
import org.hibernate.SessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@SpringBootApplication
public class SpringHibernateDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringHibernateDemoApplication.class, args);
    }
    @Bean
    public SessionFactory createSessionFactory(){
        System.out.println("created");
        return new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
    }

}
