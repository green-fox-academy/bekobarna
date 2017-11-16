package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long>{

    @Query(value = "SELECT * FROM Post ORDER BY score DESC", nativeQuery = true)
    List<Post> listall();

}
