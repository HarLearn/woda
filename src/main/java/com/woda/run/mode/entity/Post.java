package com.woda.run.mode.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "posts")
@ToString(callSuper = true)
public class Post {

    /**
     * 文章 ID
     */
    @Id
    Integer id;

    /**
     * 文章标题
     */
    @Column(name = "title",length = 126)
    String title;

    /**
     * 文章状态
     */
    @Column(name = "status")
    String status;

    /**
     * 文章链接
     */
    @Column(name = "url")
    String url;

    /**
     * 文章字数
     */
    @Column(name = "word_count")
    Long wordCount;

    /**
     * 文章 Markdown 文件
     */
    @Column(name = "original_content")
    String originalContent;

    /**
     * 文章 HTML 文件
     */
    @Column(name = "format_content")
    String formatContent;

    /**
     * 文章的编辑时间
     */
    @Column(name = "edit_time")
    Date editTime;

    /**
     * 文章的访问量
     */
    @Column(name = "visits")
    Long visits;

    /**
     * 文章的点赞数量
     */
    @Column(name = "likes")
    Long likes;

    /**
     * 是否允许评论
     */
    @Column(name = "disallow_comment")
    Boolean disallowComment;

}
