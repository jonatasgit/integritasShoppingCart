package com.test.shoppingcart.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.shoppingcart.models.Product;
import com.test.shoppingcart.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@CrossOrigin
	@GetMapping("/products")
	public Page<Product> getProducts(Pageable pageable){
		return productRepository.findAll(pageable);
	}
	
	@PostMapping("/product")
    public Product createProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }
}
