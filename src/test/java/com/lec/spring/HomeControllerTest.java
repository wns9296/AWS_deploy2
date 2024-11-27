package com.lec.spring;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HomeControllerTest {

    @Autowired
    private TestRestTemplate restTemplate = new TestRestTemplate();

    @Test
    void home() {
        ResponseEntity<String> response = restTemplate.getForEntity("/aws/v1", String.class);
        assertEquals("<h1>AWS 배포 v2.0</h1>" , response.getBody());
    }

}