package com.one23.official.repository;

import com.one23.official.model.StoreManager;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StoreManagerRepository extends MongoRepository<StoreManager, String> {

}
