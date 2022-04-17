package com.waylau.springboot.newsserver.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity // 实体
public class News {

    @Id // 主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 自增长策略
    private Long newsId; // 实体一个唯一标识
    private String title;
    private String content;
    private Date creation;

    protected News() { // 无参构造函数；设为 protected 防止直接使用
    }

    public News(String title, String content, Date creation) {
        this.title = title;
        this.content = content;
        this.creation = creation;
    }

    public Long getNewsId() {
        return newsId;
    }

    public void setNewsId(Long newsId) {
        this.newsId = newsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return String.format("News[newsId=%d, content='%s', creation='%s']", newsId, content, creation);
    }
}