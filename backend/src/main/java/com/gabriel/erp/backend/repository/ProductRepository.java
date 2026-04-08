package com.gabriel.erp.backend.repository;
import com.gabriel.erp.backend.model.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> 
//  ProductRepository doesnt have code so i create a proxy auto class with
//  for auto sql querys  , generate code knowing to convert objects from
// the product class on the sql tables rows and and the primary key of the table
// long typr for methods im gonna use later
{
    List<Product> findByName(String name); //--> SELECT *FROM products WHERE name = ??

    List<Product> findPriceLessThan(Double price);//--> SELECT *FROM products WHERE price < ??
    
} 
