package com.socialharazi.dao;

import com.socialharazi.models.Product;
import com.socialharazi.repos.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by pronit on 18/3/17.
 */
@Service
@Transactional
public class ProductDAO {


    @Autowired
    ProductRepo productRepo;

    public void save(Product product){
        productRepo.save(product);
    }

}
