package com.anwar.ecommerse.multivendor.service;

import com.anwar.ecommerse.multivendor.response.ApiResponse;
import org.springframework.stereotype.Service;

@Service
public class HomeService {


    public ApiResponse homeServiceHandler() {
        ApiResponse apiResponse=new ApiResponse();
        apiResponse.setMessage("Welcome to home page of my ecommerse application");
        return apiResponse;
    }
}
