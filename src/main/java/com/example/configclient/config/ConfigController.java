package com.example.configclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ConfigController {

    @Value("${diqksrk.test}")
    private String str1;

    @GetMapping("/test1")
    public String test1() {
        return str1;
    }
}
