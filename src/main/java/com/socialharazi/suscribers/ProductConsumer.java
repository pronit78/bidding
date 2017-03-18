package com.socialharazi.suscribers;

import com.socialharazi.dao.ProductDAO;
import com.socialharazi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * Created by pronit on 18/3/17.
 */
@Component
public class ProductConsumer {


    @Autowired
    private ProductDAO productDAO;

    @JmsListener(destination = "PRODUCT_TOPIC")
    public void save(Product product){
        System.out.println(product.getPrice());
        productDAO.save(product);
    }

}
