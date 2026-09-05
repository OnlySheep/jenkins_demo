package com.itsheep.jenkins_demo.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HealthTestControllerTests {

    @Test
    void returnsUpStatus() {
        HealthTestController.HealthResponse response = new HealthTestController().health();

        assertEquals("UP", response.status());
    }
}
