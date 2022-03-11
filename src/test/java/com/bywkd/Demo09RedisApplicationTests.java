package com.bywkd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class Demo09RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        //没有redis服务器会报错
        redisTemplate.opsForValue().set("ss","ee");
        System.out.println(redisTemplate.opsForValue().get("ss"));
        System.out.println("one1");

    }

}
