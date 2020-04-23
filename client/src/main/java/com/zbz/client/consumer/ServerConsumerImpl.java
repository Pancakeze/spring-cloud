package com.zbz.client.consumer;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by zhibingze on 2020/4/8.
 */

@Component
public class ServerConsumerImpl  implements ServerConsumer{

    @Override
    public String say(@PathVariable Long id) {

        return "我被降级了!";
    }

}
