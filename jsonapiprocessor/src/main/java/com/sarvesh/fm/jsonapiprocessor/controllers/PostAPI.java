package com.sarvesh.fm.jsonapiprocessor.controllers;

import java.util.List;

import com.sarvesh.fm.jsonapiprocessor.entities.Post;
import com.sarvesh.fm.jsonapiprocessor.repositories.PostStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**PostAPI Class for GET Posts API.
 * @author Sarvesh Shaha
 */
@CrossOrigin(origins = {"http://localhost:3000", "http://sarvesh-fm-api-consumer.s3-website-ap-southeast-2.amazonaws.com/"})
@RestController
@RequestMapping("api/")
public class PostAPI {

    @Autowired
    private PostStore postStore;

    /**Gets Posts from PostStore.
     * @return All posts present in PostStore.
     */
    @GetMapping("posts")
    public List <Post> getPosts() {
        return this.postStore.findAll();
    }
}