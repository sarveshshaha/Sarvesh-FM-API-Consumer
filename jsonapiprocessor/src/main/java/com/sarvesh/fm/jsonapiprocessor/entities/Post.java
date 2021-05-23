package com.sarvesh.fm.jsonapiprocessor.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**Post Class for Post JSON objects.
 * @author Sarvesh Shaha
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long identity;

    @Column(name = "userId")
    private int userId;

    @Column(name = "id")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "body")
    private String body;

    /**Empty Post constructor for persistence framework.
     */
    public Post() {
    }

    /**Constructs an User with its id, name, username, and email.
     * @param userId Post owner's User id.
     * @param id Post id.
     * @param title Post title.
     * @param body Post body.
     */
    public Post(int userId, int id, String title, String body) {
        super();
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    /**Gets Post owner's User id.
     * @return userId int primitive representing Post owner's User id.
     */
    public int getUserId() {
        return userId;
    }

    /**Sets Post owner's User id.
     * @param userId int primitive containing Post owner's User id.
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**Gets Post id.
     * @return id int primitive representing Post id.
     */
    public int getId() {
        return id;
    }

    /**Sets Post id.
     * @param id int primitive containing Post id.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**Gets Post title.
     * @return title String representing Post title.
     */
    public String getTitle() {
        return title;
    }

    /**Sets Post title.
     * @param title String containing Post title.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**Gets Post body.
     * @return body String representing Post body.
     */
    public String getBody() {
        return body;
    }

    /**Sets Post body.
     * @param body String containing Post body.
     */
    public void setBody(String body) {
        this.body = body;
    }

//    @Override
//    public String toString() {
//        return "Post{" +
//                "UserId='" + userId + '\'' +
//                "id='" + id + '\'' +
//                "title='" + title + '\'' +
//                ", body=" + body +
//                '}';
//    }
}
