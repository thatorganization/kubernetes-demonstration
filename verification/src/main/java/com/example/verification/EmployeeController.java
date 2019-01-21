package com.example.verification;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController.class);

    @GetMapping("/newer")
    public JsonNode getEmployees() {
        LOGGER.info("VALUEEEEEEEEEAAASAAAEAEAEEEEESASASAERTRART");
        String value = System.getenv("SERVICES_DOMAIN") == null
            ? "THERE"
            : ("." + System.getenv("SERVICES_DOMAIN"));

        LOGGER.info("CAME HERE : [" + value + "]");
        //return null;
        return restTemplate.getForObject("http://demoe:8080/employees", ObjectNode.class);
    }

    @GetMapping("/that")
    public String getEmployeesaaaaAA() {
        return "AAAAAAAAAAß";
    }

}
