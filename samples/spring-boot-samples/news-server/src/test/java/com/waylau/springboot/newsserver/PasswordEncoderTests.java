package com.waylau.springboot.newsserver;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class PasswordEncoderTests {

    @Test
    void setEncodePassword() {
        org.springframework.security.crypto.password.PasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodePasswd = encoder.encode("waylau123");
        System.out.println(encodePasswd);
    }
}
