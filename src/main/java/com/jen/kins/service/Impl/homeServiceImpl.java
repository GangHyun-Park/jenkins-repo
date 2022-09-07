package com.jen.kins.service.Impl;

import com.jen.kins.service.homeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class homeServiceImpl implements homeService {

    @Override
    public Map<String, Object> getHome() {

        Map<String, Object> home = new HashMap<>();
        home.put("i want", "go test");
        home.put("eag", "my ccc");
        home.put("hi", "real");

        return home;
    }

    @Override
    public Map<String, Object> getTset() {
        Map<String, Object> home = new HashMap<>();
        home.put("i want", "go home");
        home.put("eag", "my company");
        home.put("hi", "real");

        return home;
    }

}
