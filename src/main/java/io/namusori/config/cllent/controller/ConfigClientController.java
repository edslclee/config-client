package io.namusori.config.cllent.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientController {

    @Value("${namoosori.value}")
    private String configStr;

    @GetMapping("/test")
    public String test() {
        return configStr;
    }
}
