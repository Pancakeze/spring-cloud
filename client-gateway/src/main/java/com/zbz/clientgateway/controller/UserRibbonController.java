package com.zbz.clientgateway.controller;

import com.zbz.clientgateway.common.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by zhibingze on 2020/4/11.
 */

@RestController
@RequestMapping(value="user")
public class UserRibbonController {


    @Autowired
    private RestTemplate restTemplate;


    @Value("${service-url.user-service}")
    private String userServerUrl;


    @GetMapping(value = "/getUser")
    public Result getUser() {
        System.out.println(userServerUrl);

        return restTemplate.getForObject(userServerUrl + "/client/user/getUser", Result.class);
    }
}
