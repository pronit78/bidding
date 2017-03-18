package com.socialharazi.repos;

import com.socialharazi.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pronit on 18/3/17.
 */
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
