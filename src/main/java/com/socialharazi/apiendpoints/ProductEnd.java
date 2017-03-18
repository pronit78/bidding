package com.socialharazi.apiendpoints;

import com.socialharazi.dao.ProductDAO;
import com.socialharazi.models.Product;
import com.socialharazi.publisher.ProductPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pronit on 18/3/17.
 */
@RestController
@RequestMapping(value = "hit")
public class ProductEnd {

    @Autowired
    private ProductDAO productDAO;

    @Autowired
    private ProductPublisher productPublisher;

    @GetMapping(value ="save")
    public void save(){
        Product product = new Product();
        product.setId(1);
        product.setPrice(10);
        productPublisher.pubProduct(product);
    }
}
