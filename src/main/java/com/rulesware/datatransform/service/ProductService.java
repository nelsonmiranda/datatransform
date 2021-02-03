package com.rulesware.datatransform.service;

import java.util.List;

import com.rulesware.datatransform.model.Product;

public interface ProductService{

	List<Product> retrieveAll();
	
	List<Product> retrieveByCategory(String category);
}
