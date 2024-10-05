package com.javaweb.springbootnyano.repository;

import com.javaweb.springbootnyano.entity.ProductEntity;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ProductRepository {
    ProductEntity createProduct(ProductEntity product);

    List<ProductEntity> findAll();
}