package com.springjava.marketSpring.domain.repository;

import com.springjava.marketSpring.domain.Product;
import com.springjava.marketSpring.persistence.ProductoRepository;
import org.aspectj.apache.bcel.classfile.Module;

import java.util.List;
import java.util.Optional;

public interface ProductRepository{
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);
}
