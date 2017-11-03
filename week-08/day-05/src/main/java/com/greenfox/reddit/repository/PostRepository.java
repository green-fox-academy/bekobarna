package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{

}
