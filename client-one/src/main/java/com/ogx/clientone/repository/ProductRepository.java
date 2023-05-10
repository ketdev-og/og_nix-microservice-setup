package com.ogx.clientone.repository;

import com.ogx.clientone.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
