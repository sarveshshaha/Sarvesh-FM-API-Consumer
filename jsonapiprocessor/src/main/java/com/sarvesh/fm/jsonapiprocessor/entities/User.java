package com.sarvesh.fm.jsonapiprocessor.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**User Class for User JSON objects.
 * @author Sarvesh Shaha
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long identity;

    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    /**Empty User constructor for persistence framework.
     */
    public User() {
    }

    /**Constructs an User with its id, name, username, and email.
     * @param id User id.
     * @param name User's name.
     * @param username Username.
     * @param email User's email.
     */
    public User(int id, String name, String username, String email) {
        super();
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
    }

    /**Gets User id.
     * @return id int primitive representing User id.
     */
    public int getId() {
        return id;
    }

    /**Sets User id.
     * @param id int primitive containing User id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**Gets User's name.
     * @return name String representing User's name.
     */
    public String getName() {
        return name;
    }

    /**Sets User's name.
     * @param name String containing User's name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**Gets Username.
     * @return username String representing Username.
     */
    public String getUsername() {
        return username;
    }

    /**Sets Username.
     * @param username String containing Username.
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**Gets User's email.
     * @return email String representing User's email.
     */
    public String getEmail() {
        return email;
    }

    /**Sets User's email.
     * @param email String containing User's email.
     */
    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id='" + id + '\'' +
//                "name='" + name + '\'' +
//                "username='" + username + '\'' +
//                ", email=" + email +
//                '}';
//    }
}
