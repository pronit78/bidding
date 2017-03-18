package com.socialharazi.repos;

import com.socialharazi.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pronit on 18/3/17.
 */
@Repository
public  interface MessageRepo extends JpaRepository<Message, Integer> {
}
