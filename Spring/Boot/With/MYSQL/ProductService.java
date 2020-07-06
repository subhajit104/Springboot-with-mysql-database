package com.cap_coder.Spring.Boot.With.MYSQL;

import java.util.List;

import com.cap_coder.Spring.Boot.With.MYSQL.Repository.productRepository;
import com.cap_coder.Spring.Boot.With.MYSQL.model.products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    private final productRepository repo;

    @Autowired
    public ProductService(productRepository repo) {
        this.repo = repo;
    }

    public List<products> listAll() {
        return repo.findAll();
    }

    public void save(products product) {
        repo.save(product);
    }

    public products get(int id) {
        return repo.findById(id).orElse(null)   ;
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}