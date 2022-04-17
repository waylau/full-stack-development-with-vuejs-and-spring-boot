package com.waylau.springboot.newsserver.repository;

import com.waylau.springboot.newsserver.domain.News;
import org.springframework.data.repository.CrudRepository;


public interface NewsRepository extends CrudRepository<News, Long> {

}