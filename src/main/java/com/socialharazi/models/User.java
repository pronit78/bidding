package com.socialharazi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pronit on 18/3/17.
 */
@Entity(name = "user")
public class User {

    private static final Integer FACEBOOK = 1;
    private static final Integer TWITTER = 2;
    private static final Integer YOUTUBE = 3;
    private static final Integer WEBSITE = 4;
    private static final Integer MOBILE = 6;
    private static final Integer EBAY = 7;
    private static final Integer WINDOWS = 8;
    private static final Integer API = 9;


    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;

    @Column(name = "usertype")
    private Integer user_type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_type() {
        return user_type;
    }

    public void setUser_type(Integer user_type) {
        this.user_type = user_type;
    }
}
