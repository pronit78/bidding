package com.socialharazi.repos;

import com.socialharazi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pronit on 18/3/17.
 */
public interface ProductRepo extends JpaRepository<Product, Integer> {
}
