package com.socialharazi.models;

import javax.persistence.*;

/**
 * Created by pronit on 18/3/17.
 */
@Entity(name = "transactiion")
public class Transaction {
    @Id
    @GeneratedValue
    @Column(name = "id", columnDefinition = "INT(11)")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private User buyer;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
