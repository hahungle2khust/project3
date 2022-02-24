package com.hung.soict.products.service;

import com.hung.soict.products.repository.ProductRepository;
import com.hung.soict.products.entities.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepo;

    @Override
    public List<Products> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public void saveProduct(Products products) {
        productRepo.save(products);
    }

    @Override
    public Products findProductById(Integer pId) {
        return productRepo.findById(pId).get();
    }

    @Override
    public Products deleteProduct(Integer pId) {
        productRepo.deleteById(pId);
        return null;
    }

}
