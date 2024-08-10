package com.ganeshgc.k8sdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/demo")
public class K8sDemoApplication {

    private static Logger logger= LoggerFactory.getLogger(K8sDemoApplication.class);

    @GetMapping
    public String demo() {
        return "I am deploying my application in kubernetes";
    }

    public static void main(String[] args) {
        logger.info("MY APPLICATION STARTED========================================");

        SpringApplication.run(K8sDemoApplication.class, args);
    }

}
