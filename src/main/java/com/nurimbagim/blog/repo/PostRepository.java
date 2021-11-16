package com.nurimbagim.blog.repo;

import com.nurimbagim.blog.models.Post;

import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {
    
}
