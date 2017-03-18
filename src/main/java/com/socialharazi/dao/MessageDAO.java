package com.socialharazi.dao;

import com.socialharazi.repos.MessageRepo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by pronit on 18/3/17.
 */
public class MessageDAO {

    @Autowired
    private MessageRepo messageRepo;
}
