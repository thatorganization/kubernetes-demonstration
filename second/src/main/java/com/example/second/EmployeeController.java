package com.example.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/employees")
    public ResponseEntity<Map<String, String>> getEmployees() {
        LOGGER.info("CAME HEREEEEEE");
        Map<String, String> values = new HashMap<>();
        values.put("name", "Thereeeeeeeeeeeeee");
        return ResponseEntity.ok(values);
    }
}
