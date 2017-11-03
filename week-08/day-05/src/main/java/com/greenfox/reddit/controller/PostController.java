package com.greenfox.reddit.controller;


import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import com.greenfox.reddit.service.PostProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/posts")
public class PostController {

    @Autowired
    PostRepository postRepository;

    @Autowired
    PostProvider postProvider;

    @GetMapping(value = {"", "/"})
    public String index(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "index";
    }

    @GetMapping(value = "/add")
    public String addPost() {
        return "add";
    }

    @PostMapping(value = "/submitPost")
    public String submitPost(@RequestParam String content){
        postRepository.save(new Post(content));
        return "redirect:/posts/";
    }

    @GetMapping(value = "/{id}/up")
    public String upVote(@PathVariable Long id) {
        postProvider.upVote(id);
        return "redirect:/posts/";
    }

    @GetMapping(value = "/{id}/down")
    public String downVote(@PathVariable Long id) {
        postProvider.downVote(id);
        return "redirect:/posts/";
    }

}
