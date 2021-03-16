package com.nxyf.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName RedisUtils
 * @Description TODO
 * @Author nxyf
 * @Date 2021/3/16 21:38
 * @Version 1.0
 **/
@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
}
