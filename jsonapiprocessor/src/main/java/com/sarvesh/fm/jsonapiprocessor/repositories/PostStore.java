package com.sarvesh.fm.jsonapiprocessor.repositories;

import com.sarvesh.fm.jsonapiprocessor.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**PostStore Interface acting as the Repository for all Posts API calls
 * @author Sarvesh Shaha
 */
@Repository
public interface PostStore extends JpaRepository<Post, Long>{

}