package com.zbz.client.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zbz.client.consumer.ServerConsumer;
import com.zbz.client.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhibingze on 2020/4/7.
 */

@RestController
public class HystrixController{

    @Autowired
    private TestService testService;

    @Autowired
    private ServerConsumer serverConsumer;

    @GetMapping("/testFallback/{id}")
    @HystrixCommand(fallbackMethod = "zbz")
    public String testFallback(@PathVariable Long id) {
//        if (id == 1) {
//            throw new IllegalArgumentException();
//        }
//        testService.say();
        String result = serverConsumer.say(2L);
        return result;
    }

    public String zbz(Long id) {
        System.out.println(id);
        return "zbz";
    }


}
