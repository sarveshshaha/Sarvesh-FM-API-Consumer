package com.sarvesh.fm.jsonapiprocessor.controllers;

import java.util.List;

import com.sarvesh.fm.jsonapiprocessor.entities.User;
import com.sarvesh.fm.jsonapiprocessor.repositories.UserStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**UserAPI Class for GET Users API.
 * @author Sarvesh Shaha
 */
@CrossOrigin(origins = {"http://localhost:3000", "http://sarvesh-fm-api-consumer.s3-website-ap-southeast-2.amazonaws.com/"})
@RestController
@RequestMapping("api/")
public class UserAPI {

    @Autowired
    private UserStore userStore;

    /**Gets Users from UserStore.
     * @return All users present in UserStore.
     */
    @GetMapping("users")
    public List <User> getUsers() {
        return this.userStore.findAll();
    }
}