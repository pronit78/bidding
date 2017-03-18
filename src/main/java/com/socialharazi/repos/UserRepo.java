package com.socialharazi.repos;

import com.socialharazi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pronit on 18/3/17.
 */
public interface UserRepo extends JpaRepository<User, Integer> {
}
