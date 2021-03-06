package com.example.onlinebanking.repository;

import com.example.onlinebanking.model.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}