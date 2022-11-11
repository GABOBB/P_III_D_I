package com.example.pruebaMongo.controller;

import com.example.pruebaMongo.model.Avenger;
import com.example.pruebaMongo.service.api.AvengerServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/avengers/api")
@CrossOrigin("*")
public class AvengerController {

    @Autowired
    private AvengerServiceAPI avengerServiceAPI;

    @GetMapping(value = "/all")
    public List<Avenger> getAll() {
        return avengerServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public Avenger find(@PathVariable Long id) {
        return avengerServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<Avenger> save(@RequestBody @Valid Avenger avenger) {
        Avenger obj = avengerServiceAPI.save(avenger);
        return new ResponseEntity<Avenger>(obj, HttpStatus.OK);
    }

    @RequestMapping (value = "/delete/{id}")
    public ResponseEntity<Avenger> delete(@PathVariable Long id) {
        Avenger avenger = avengerServiceAPI.get(id);

        if (avenger != null) {
            avengerServiceAPI.delete(id);
        } else {
            return new ResponseEntity<Avenger>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<Avenger>(avenger, HttpStatus.OK);
    }
}
