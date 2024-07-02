package com.example.teamplatform.service;

import com.example.teamplatform.model.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

/**
 * Redis 测试
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://example.icu">编程导航知识星球</a>
 */
@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        // 增
        valueOperations.set("yupiString", "dog");
        valueOperations.set("yupiInt", 1);
        valueOperations.set("yupiDouble", 2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("example");
        valueOperations.set("yupiUser", user);
        // 查
        Object example = valueOperations.get("yupiString");
        Assertions.assertTrue("dog".equals((String) example));
        example = valueOperations.get("yupiInt");
        Assertions.assertTrue(1 == (Integer) example);
        example = valueOperations.get("yupiDouble");
        Assertions.assertTrue(2.0 == (Double) example);
        System.out.println(valueOperations.get("yupiUser"));
        valueOperations.set("yupiString", "dog");
        redisTemplate.delete("yupiString");
    }
}
