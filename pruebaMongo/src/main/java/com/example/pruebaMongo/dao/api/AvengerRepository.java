package com.example.pruebaMongo.dao.api;

import com.example.pruebaMongo.model.MatrixIns;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AvengerRepository extends MongoRepository<MatrixIns, Long> {
}
