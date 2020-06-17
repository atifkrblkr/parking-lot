package com.karbelkardesigns.parkinglot.service;

import com.karbelkardesigns.parkinglot.bean.Response;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminService {

    @GetMapping(value = "/stats")
    public Response getStatistics(){
        Response response = new Response();
        response.setStatus("OK");
        response.setMessage("");
        response.setData("5");
        return response;
    }
}
