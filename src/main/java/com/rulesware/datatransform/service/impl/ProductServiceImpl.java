package com.rulesware.datatransform.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rulesware.datatransform.model.Product;
import com.rulesware.datatransform.service.ProductService;

@Service("productServiceImpl")
public class ProductServiceImpl implements ProductService{

	private static List<Product> products = new ArrayList<>();
	
	static {
		Product product1 = new Product(1001, "'Laptop Hp'", "Intel i7, 4 GB RAM ", 1000, "Laptop");
		Product product2 = new Product(1002, "\"Laptop Hp\"", "Intel i5, 8 GB RAM ", 900, "Laptop");
		Product product3 = new Product(1003, "'Keyboard'", "Gaming keyboard",150, "Accessory");
		Product product4 = new Product(1004, "Webcam", "1080p live streaming webcam", 50, "Accessory" );
		Product product5 = new Product(1005, "iBUYPOWER PC", "ALL IN ONE, AMD RYZEN 5 4500U", 700, "PC");
		Product product6 = new Product(1006, "CyberpowerPC", "Gamer Xtreme VR Gaming PC", 800, "PC");
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
	}
	

	public List<Product> retrieveAll() {
		
		return products;
	}

	public List<Product> retrieveByCategory(String category) {
	
		List<Product> productsFiltered = new ArrayList<Product>();
		for (Product product: products) {
			if(product.getCategory().equals(category)) {
				productsFiltered.add(product);
			}
		}
		return productsFiltered;
	}

	
}
