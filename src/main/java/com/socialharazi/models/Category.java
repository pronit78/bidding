package com.socialharazi.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by pronit on 18/3/17.
 */


@Entity(name = "category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "id" ,columnDefinition = "INT(11)")
    private Integer id;

    @Column(name = "category_name")
    private String categoryname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }
}
