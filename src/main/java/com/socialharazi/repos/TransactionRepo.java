package com.socialharazi.repos;

import com.socialharazi.models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by pronit on 18/3/17.
 */
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {
}
