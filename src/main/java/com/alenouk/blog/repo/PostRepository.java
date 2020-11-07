package com.alenouk.blog.repo;

import com.alenouk.blog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository  extends CrudRepository<Post, Long> {
}
