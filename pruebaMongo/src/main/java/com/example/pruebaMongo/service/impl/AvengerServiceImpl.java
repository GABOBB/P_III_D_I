package com.example.pruebaMongo.service.impl;

import com.example.pruebaMongo.commons.GenericServiceImpl;
import com.example.pruebaMongo.dao.api.AvengerRepository;
import com.example.pruebaMongo.model.Avenger;
import com.example.pruebaMongo.service.api.AvengerServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class AvengerServiceImpl extends GenericServiceImpl<Avenger, Long> implements AvengerServiceAPI {

    @Autowired
    private AvengerRepository avengerRepository;

    @Override
    public CrudRepository<Avenger, Long> getDao() {
        return avengerRepository;
    }
}
