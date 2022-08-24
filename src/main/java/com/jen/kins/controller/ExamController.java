package com.jen.kins.controller;

import com.jen.kins.service.homeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequiredArgsConstructor
public class ExamController {

    private final homeService homeService;

    @GetMapping("/info")
    public Map<String, Object> goHome(){
        return homeService.getHome();
    }
}
