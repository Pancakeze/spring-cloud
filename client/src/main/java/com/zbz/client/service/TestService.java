package com.zbz.client.service;

import org.springframework.stereotype.Service;

/**
 * Created by zhibingze on 2020/4/8.
 */
@Service
public class TestService {

    public void say() {

        throw new IllegalArgumentException();
    }

}
