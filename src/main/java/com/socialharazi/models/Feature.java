package com.socialharazi.models;

import javax.persistence.*;

/**
 * Created by pronit on 18/3/17.
 */
@Entity(name = "feature")
public class Feature {
    @Id
    @GeneratedValue
    @Column(name = "id" ,columnDefinition = "INT(11)")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "feature_name" )
    private Integer featurename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getFeaturename() {
        return featurename;
    }

    public void setFeaturename(Integer featurename) {
        this.featurename = featurename;
    }
}
