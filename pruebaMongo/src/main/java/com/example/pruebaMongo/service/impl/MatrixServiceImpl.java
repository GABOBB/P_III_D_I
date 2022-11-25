package com.example.pruebaMongo.service.impl;

import com.example.pruebaMongo.commons.GenericServiceImpl;
import com.example.pruebaMongo.dao.api.AvengerRepository;
import com.example.pruebaMongo.model.MatrixIns;
import com.example.pruebaMongo.service.api.MatrixServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class MatrixServiceImpl extends GenericServiceImpl<MatrixIns, Long> implements MatrixServiceAPI {

    @Autowired
    private AvengerRepository avengerRepository;

    @Override
    public CrudRepository<MatrixIns, Long> getDao() {
        return avengerRepository;
    }
}
