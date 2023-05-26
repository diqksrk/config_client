package com.example.configclient.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StaticConfigService {
    @Value("${spring.application.name}")
    private String name;
    @Value("${server.port}")
    private String port;

    public Map<String, String> getConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        map.put("port", port);
        return map;
    }
}
