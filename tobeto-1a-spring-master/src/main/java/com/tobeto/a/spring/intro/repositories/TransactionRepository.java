package com.tobeto.a.spring.intro.repositories;

import com.tobeto.a.spring.intro.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
