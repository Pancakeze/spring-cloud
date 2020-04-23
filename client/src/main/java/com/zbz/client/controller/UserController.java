package com.zbz.client.controller;

import com.zbz.client.common.Result;
import com.zbz.client.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhibingze on 2020/4/11.
 */

@RestController
@RequestMapping(value="/user")
public class UserController {


    @GetMapping(value="/getUser")
    public Result<User> getUser() {
        System.out.println("我被击中了!!");
        return new Result<>(new User(1L, "zbz", "123456"));
    }

}
