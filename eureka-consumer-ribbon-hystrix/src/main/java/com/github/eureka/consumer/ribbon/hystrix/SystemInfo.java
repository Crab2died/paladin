package com.github.eureka.consumer.ribbon.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SystemInfo {

    @Autowired
    ConsumerService consumerService;

    @GetMapping("/consumer")
    public String sysInfo() {
        return consumerService.consumer();
    }

    @Service
    class ConsumerService {

        @Autowired
        RestTemplate restTemplate;

        /**
         *  <p>降级服务，当请求失败或超时是将会跳转fallbackMethod</p></br>
         */
        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer() {
            String str = restTemplate.getForObject("http://eureka-provider/sys/info", String.class);
            System.out.println(str);
            return str;
        }

        public String fallback() {
            return "fallback";
        }
    }
}
