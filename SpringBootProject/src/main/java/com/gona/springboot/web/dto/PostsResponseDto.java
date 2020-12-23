package com.gona.springboot.web.dto;

import com.gona.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    public Long id;
    public String title;
    public String content;
    public String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }

}
