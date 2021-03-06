package com.example.onlinebanking.repository;

import com.example.onlinebanking.model.Recipient;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface RecipientDao extends CrudRepository<Recipient, Long> {

    List<Recipient> findAll();

    Recipient findByName(String recipientName);

    void deleteByName(String recipientName);
}