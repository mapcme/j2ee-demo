package com.mapc.j2ee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Java8LocaldatetimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Java8LocaldatetimeApplication.class, args);
    }

    @PostMapping("/test")
    public void test(@RequestBody User user){
        System.out.println(user.toString());
    }

}
