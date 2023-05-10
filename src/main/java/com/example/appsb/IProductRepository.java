package com.example.appsb;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author carlo
 */
public interface IProductRepository extends JpaRepository<Product,Long>{
    
}
