package com.zbz.clientgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhibingze on 2020/4/10.
 */

@RestController
public class FirstController {

    @GetMapping("/test")
    public String test() {
        System.out.println(13);
        return "zbz";
    }
}
