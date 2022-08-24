package com.example.githubactionsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GithubActionsSpringBootApplication.class, args);
    }


    @GetMapping("/api/hello")
    public ResponseEntity<?> hello(){
        return ResponseEntity.ok("hello");
    }

}
