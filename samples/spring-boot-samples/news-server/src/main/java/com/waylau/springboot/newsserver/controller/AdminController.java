package com.waylau.springboot.newsserver.controller;

import com.waylau.springboot.newsserver.domain.News;
import com.waylau.springboot.newsserver.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Admin 控制器
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2022年4月17日
 */
@RequestMapping("/admins")
@RestController
public class AdminController {

    @Autowired
    private NewsRepository newsRepository;

    // Hello World
    @RequestMapping("/hi")
    public String hello() {
        return "Hello World!";
    }

    // 创建新闻
    @PostMapping("/news")
    public void createNews(@RequestBody News news) {
        newsRepository.save(news);
    }
}