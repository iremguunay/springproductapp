package com.bilgeadam.productapp.repository;

import com.bilgeadam.productapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
