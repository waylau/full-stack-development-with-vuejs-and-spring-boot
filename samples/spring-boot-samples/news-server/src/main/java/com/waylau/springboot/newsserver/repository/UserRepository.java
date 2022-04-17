package com.waylau.springboot.newsserver.repository;

import com.waylau.springboot.newsserver.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * User Repository 接口.
 *
 * @since 1.0.0 2022年4月16日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public interface UserRepository extends JpaRepository<User, Long>{

    /**
     * 根据用户账号查询用户
     * @param username
     * @return
     */
    User findByUsername(String username);
}