package com.szkaminski.mypageserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.delivery.request"})
@EntityScan("com.delivery.domain")
@EnableJpaRepositories("com.szkaminski.mypageserver.repositories.CommentRepository")
public class MyPageServer {

    public static void main(String[] args) {
        SpringApplication.run(MyPageServer.class, args);
    }

}
