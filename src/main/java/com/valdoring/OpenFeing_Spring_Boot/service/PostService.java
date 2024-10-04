package com.valdoring.OpenFeing_Spring_Boot.service;

import com.valdoring.OpenFeing_Spring_Boot.client.PostClient;
import com.valdoring.OpenFeing_Spring_Boot.dto.PostDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostClient postClient;

    public PostDto save(PostDto postDto){
        return postClient.savePost(postDto);
    }

    public List<PostDto> getPosts(){
        return postClient.allPost();
    }

    public List<PostDto> getPostByUser(Integer id){
        return postClient.getPostByUserId(id);
    }

    public PostDto update(Integer id, PostDto postDto){
        return postClient.updatePost(id, postDto);
    }

    public void delete(Integer id){
        postClient.deletePost(id);
    }
}
