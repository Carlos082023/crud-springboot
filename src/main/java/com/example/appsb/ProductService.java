/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.appsb;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author carlo
 */
@Service
public class ProductService {
    @Autowired
    private IProductRepository repo;
    
    public List<Product> listAll(){
   return repo.findAll();
            }
    
    public void save(Product product){
         repo.save(product);
    }
    
    public Product get(Long id){
        return (Product) repo.findById(id).get();
    }
    
    public void delete(Long id){
        repo.deleteById(id);
    }
   
   
    
}
