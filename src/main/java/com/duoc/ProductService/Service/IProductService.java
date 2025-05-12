package com.duoc.ProductService.Service;

import java.util.List;

import com.duoc.ProductService.Model.Product;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProduct(Product product);
    Product deleteProduct(Long id);
    Product getProductById(Long id);
    List<Product> getAllProducts();
}
