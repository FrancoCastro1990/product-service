package com.duoc.ProductService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.duoc.ProductService.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
