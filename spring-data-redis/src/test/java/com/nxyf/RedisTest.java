package com.nxyf;

import redis.clients.jedis.Jedis;

/**
 * @ClassName com.nxyf.RedisTest
 * @Description TODO
 * @Author nxyf
 * @Date 2021/3/16 20:00
 * @Version 1.0
 **/
public class RedisTest {

    public static void main(String[] args) {
        //连接Redis
        Jedis jedis = new Jedis("192.168.253.128",6379);
        System.out.println(jedis.ping());

        jedis.close();
    }
}
