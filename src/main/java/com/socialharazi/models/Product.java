package com.socialharazi.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by pronit on 18/3/17.
 */
@Entity(name = "product")
public class Product implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;

    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "price")
    private float price;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
