package org.sid.lightecomv1.web;

import org.sid.lightecomv1.dao.ProductRepository;
import org.sid.lightecomv1.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
public class productControleur {

    @Autowired
    private ProductRepository repository;
    @GetMapping("/produitTest")
    public List<Product> getAll(){
        return repository.findAll();

    }
}
