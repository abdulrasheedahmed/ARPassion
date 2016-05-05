package com.arpassion.springboot.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.arpassion" })
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}