package com.test.shoppingcart;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.test.shoppingcart.controllers.ProductController;
import com.test.shoppingcart.models.Product;
import com.test.shoppingcart.repositories.ProductRepository;

@SpringBootTest
class ProductControllerTest {
	
	@InjectMocks
	ProductController productController;
	
	@Mock
	ProductRepository productRepository;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetProducts() {
		Product product = new Product();
		product.setId((long) 123);
		product.setName("New Product");
		product.setPrice(new BigDecimal(555));
		
		when(productRepository.findOneByName(anyString())).thenReturn(product);
		Pageable page = new PageRequest(0, 10);
		Page<Product> products = productController.getProducts(page);
		
		assertNull(products);
	}

	@Test
	@Disabled
	void testCreateProduct() {
		fail("Not yet implemented");
	}

}
