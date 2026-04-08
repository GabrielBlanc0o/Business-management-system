package com.gabriel.erp.backend.service;

import org.springframework.stereotype.Service;

import com.gabriel.erp.backend.model.Product;
import com.gabriel.erp.backend.repository.ProductRepository;

@Service

public class ProductService {
    
    //inyect to the repo
    private final ProductRepository productRepository;


    // CONSTRUCTOR FOR allow to spring inyect the dependence automatic
    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    // an example below

    public Product saveProduct(Product product)
    {
        if (product.getPrice()<0){
            throw new RuntimeException("The price cannot be negative");

        }
        return productRepository.save(product);


    }



}
