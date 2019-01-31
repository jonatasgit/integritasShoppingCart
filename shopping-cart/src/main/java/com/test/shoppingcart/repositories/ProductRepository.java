package com.test.shoppingcart.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.shoppingcart.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findOneByName(String productName);

}
