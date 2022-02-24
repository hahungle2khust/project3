package com.hung.soict.products.service;

import com.hung.soict.products.entities.Products;

import java.util.List;

public interface ProductService {
    public List<Products> getAllProducts();
    public void saveProduct(Products products);
    public Products findProductById(Integer pId);
    public Products deleteProduct(Integer pId);
}
