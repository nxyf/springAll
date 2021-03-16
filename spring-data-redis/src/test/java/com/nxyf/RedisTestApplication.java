package com.nxyf;

import com.nxyf.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;


/**
 * @ClassName com.nxyf.RedisTestApplication
 * @Description TODO
 * @Author nxyf
 * @Date 2021/3/16 20:55
 * @Version 1.0
 **/
@SpringBootTest
public class RedisTestApplication {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    void redisTest() {
        User user = new User();
        user.setAge(3);
        user.setName("nxyf");
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));

    }
}
