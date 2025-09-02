package com.anwar.ecommerse.multivendor.controller;

import com.anwar.ecommerse.multivendor.response.ApiResponse;
import com.anwar.ecommerse.multivendor.service.HomeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping
    public ApiResponse homeControllerHandler(){
        return homeService.homeServiceHandler();
    }
}
