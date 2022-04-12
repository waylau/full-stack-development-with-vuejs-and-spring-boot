package com.waylau.springboot.jpainaction.repository;

import com.waylau.springboot.jpainaction.domain.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {

}