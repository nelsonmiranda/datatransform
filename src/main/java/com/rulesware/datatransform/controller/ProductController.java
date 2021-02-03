package com.rulesware.datatransform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rulesware.datatransform.model.Product;
import com.rulesware.datatransform.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	@Qualifier("productServiceImpl")
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> retrieveProducts(){
		
		return productService.retrieveAll();
	}

	@GetMapping("/products/{category}")
	public List<Product> retrieveProductsByCategory(@PathVariable String category){

		return productService.retrieveByCategory(category);
	}
	
}
