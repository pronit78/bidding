package com.socialharazi.dao;

import com.socialharazi.repos.CategoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by pronit on 18/3/17.
 */
@Service
@Transactional
public class CategoryDAO {

    @Autowired
    private CategoryRepo categoryRepo;


}
