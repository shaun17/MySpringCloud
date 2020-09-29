package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @Author wenrenhao
 * @Date 2020-09-16 15:50
 * @Version 1.0
 */
@Component
public class HystricImpl implements FeignService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry it is Hystric";
    }
}
