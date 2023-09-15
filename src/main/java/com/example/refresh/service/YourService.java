package com.example.refresh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class YourService {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    public void someMethod() {
        // Redis 템플릿을 사용하여 작업을 수행
        redisTemplate.opsForValue().set("someKey", "someValue");
    }
}
