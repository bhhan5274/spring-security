package com.bhhan.springsecurity;

import com.bhhan.springsecurity.domain.user.UserEntity;
import com.bhhan.springsecurity.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Application {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner applicationRunner(){
        return args -> {
            userService.joinUser(UserEntity.builder().email("admin@example.com").password("12345").build());
            userService.joinUser(UserEntity.builder().email("user@example.com").password("12345").build());
        };
    }
}
