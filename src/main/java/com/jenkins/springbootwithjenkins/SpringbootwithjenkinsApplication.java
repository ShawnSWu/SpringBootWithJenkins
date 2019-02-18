package com.jenkins.springbootwithjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class SpringbootwithjenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwithjenkinsApplication.class, args);
    }


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @RequestMapping("/api/1")
    @ResponseBody
    String api1() {
        return "This is api 1!";
    }
}
