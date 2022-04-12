package com.waylau.springboot.jpainaction.repository;

import com.waylau.springboot.jpainaction.domain.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class UserRepositoryTests {
    private static final Long USER_ID = 1L;

    @Autowired
    private UserRepository userRepository;


    @Order(1)
    @Test
    void testSave() {
        User user = new User(USER_ID, "waylau", "waylau521@gmail.com");
        userRepository.save(user);
        System.out.println("save user:" + user);
    }

    @Order(2)
    @Test
    void testFindById() {
        Optional<User> userOptional = userRepository.findById(USER_ID);
        System.out.println("find user:" + userOptional.get());
    }

    @Order(3)
    @Test
    void testUpdate() {
        Optional<User> userOptional = userRepository.findById(USER_ID);
        User user = userOptional.get();
        user.setEmail("waylau@live.cn");
        userRepository.save(user); // 保存修改

        // 查询修改后的结果
        userOptional = userRepository.findById(USER_ID);
        user = userOptional.get();
        System.out.println("update user:" + user);
    }

    @Order(4)
    @Test
    void testDelete() {
        userRepository.deleteById(USER_ID);
        System.out.println("delete user:" + USER_ID);
    }

}
