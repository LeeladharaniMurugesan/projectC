package com.chainsys.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 
class ProjectCApplication {

public static void main(String[] args) {
    SpringApplication.run(ProjectCApplication.class, args); //launch JVM then main method is loaded then TOMCAT is running then spring container loaded

    }

}