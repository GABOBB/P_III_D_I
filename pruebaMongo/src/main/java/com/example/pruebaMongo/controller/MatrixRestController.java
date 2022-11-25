package com.example.pruebaMongo.controller;

import com.example.pruebaMongo.model.MatrixIns;
import com.example.pruebaMongo.service.api.MatrixServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/api/")
@CrossOrigin("*")
public class MatrixRestController {

    @Autowired
    private MatrixServiceAPI matrixServiceAPI;

    @GetMapping(value = "/all")
    public List<MatrixIns> getAll() {
        return matrixServiceAPI.getAll();
    }

    @GetMapping(value = "/find/{id}")
    public MatrixIns find(@PathVariable Long id) {
        return matrixServiceAPI.get(id);
    }

    @PostMapping(value = "/save")
    public ResponseEntity<MatrixIns> save(@RequestBody @Valid MatrixIns matrixIns) {
        MatrixIns obj = matrixServiceAPI.save(matrixIns);
        return new ResponseEntity<MatrixIns>(obj, HttpStatus.OK);
    }

    @GetMapping(value = "/delete/{id}")
    public ResponseEntity<MatrixIns> delete(@PathVariable Long id) {
        MatrixIns matrixIns = matrixServiceAPI.get(id);

        if (matrixIns != null) {
            matrixServiceAPI.delete(id);
        } else {
            return new ResponseEntity<MatrixIns>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<MatrixIns>(matrixIns, HttpStatus.OK);
    }
}
