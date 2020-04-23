package com.zbz.server.client.provider;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhibingze on 2020/4/8.
 */

@RestController
@RequestMapping(value = "/test")
public class ClientProvider {

    @GetMapping(value = "say/{id}")
    public String say(@PathVariable("id") Long id) {
        return "zbz";
    }
}
