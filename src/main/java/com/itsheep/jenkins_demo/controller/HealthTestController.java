package com.itsheep.jenkins_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthTestController {

    @GetMapping("/health")
    public HealthResponse health() {
        return new HealthResponse("UP");
    }

    public record HealthResponse(String status) {
    }
}
