package com.greenfox.reddit.service;


import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostProvider {

    @Autowired
    PostRepository postRepository;

    public void upVote(Long id) {
        postRepository.findOne(id).setScore(postRepository.findOne(id).score + 1);
        postRepository.save(postRepository.findOne(id));
    }

    public void downVote(Long id) {
        postRepository.findOne(id).setScore(postRepository.findOne(id).score - 1);
        postRepository.save(postRepository.findOne(id));
    }

}
