package com.mapc.j2ee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//@ServletComponentScan("com.mapc.j2ee.filter")
@SpringBootApplication
public class J2eeFilterInterceptorServletApplication {

    public static void main(String[] args) {
        SpringApplication.run(J2eeFilterInterceptorServletApplication.class, args);
    }

}
