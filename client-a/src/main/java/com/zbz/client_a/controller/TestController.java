package com.zbz.client_a.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhibingze on 2020/4/8.
 */

@RestController
public class TestController {

    @GetMapping("test")
    public String test() {
        return "zbz";
    }
}
