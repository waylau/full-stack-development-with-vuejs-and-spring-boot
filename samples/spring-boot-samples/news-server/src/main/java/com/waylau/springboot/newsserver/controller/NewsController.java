package com.waylau.springboot.newsserver.controller;

import com.waylau.springboot.newsserver.domain.News;
import com.waylau.springboot.newsserver.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * News 控制器
 *
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2022年4月17日
 */
@RequestMapping("/news")
@RestController
public class NewsController {

    @Autowired
    private NewsRepository newsRepository;

    // 获取新闻列表
    @GetMapping
    public List<News> getNewsList() {
        Iterable<News> newsIterable = newsRepository.findAll();
        List<News> newsList = new ArrayList<>();

        // Iterable转List
        newsIterable.forEach(news -> {
            newsList.add(news);
        });

        return newsList;
    }

    // 获取新闻详情
    @GetMapping("/{newsId}")
    public News getNewsById(@PathVariable Long newsId) {
        Optional<News> newsOptional = newsRepository.findById(newsId);
        return newsOptional.orElse(null);
    }
}