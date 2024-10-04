package com.valdoring.OpenFeing_Spring_Boot.client;

import com.valdoring.OpenFeing_Spring_Boot.dto.PostDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "post", url = "https://jsonplaceholder.typicode.com")
public interface PostClient {

    @PostMapping("/posts")
    PostDto savePost(@RequestBody PostDto postDto);

    @GetMapping("/posts")
    List<PostDto> allPost();

    @GetMapping("users/{userId}/posts")
    List<PostDto> getPostByUserId(@PathVariable Integer userId);

    @PutMapping("/posts/{id}")
    PostDto updatePost(@PathVariable Integer id, PostDto postDto);

    @DeleteMapping("/posts/{id}")
    void deletePost(@PathVariable Integer id);
}
