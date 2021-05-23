package com.sarvesh.fm.jsonapiprocessor.repositories;

import com.sarvesh.fm.jsonapiprocessor.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**UserStore Interface acting as the Repository for all Users API calls
 * @author Sarvesh Shaha
 */
@Repository
public interface UserStore extends JpaRepository<User, Long>{

}