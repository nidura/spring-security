/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan(basePackages = "com.mycompany")
@SpringBootApplication
public class Application extends SpringBootServletInitializer  {


    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
