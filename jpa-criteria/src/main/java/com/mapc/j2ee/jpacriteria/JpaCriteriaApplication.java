package com.mapc.j2ee.jpacriteria;

import com.mapc.j2ee.jpacriteria.service.DeptService;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class JpaCriteriaApplication implements ApplicationRunner {

    public static void main(String[] args) {
        SpringApplication.run(JpaCriteriaApplication.class, args);
    }

    @Resource
    private DeptService deptService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        deptService.findDeptPage(null);
    }
}
