package com.zbz.client.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhibingze on 2020/4/8.
 */

@FeignClient(value = "zbz-server", path = "server/test", fallback = ServerConsumerImpl.class)
public interface ServerConsumer {


    @RequestMapping(value = "say/{id}", method = RequestMethod.GET)
    String say(@PathVariable(value = "id") Long id);


}
