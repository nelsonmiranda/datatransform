package com.rulesware.datatransform.helpers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rulesware.datatransform.service.ProductService;

@Component
public class InitCommandLine implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ProductService productService;
		
	@Override
	public void run(String... args) throws Exception {

		logger.info("*********** ALL *********");
		logger.info("Products -> {}", productService.retrieveAll());
		
		logger.info("*********** BY PC CATEGORY *********");
		logger.info("Products -> {}", productService.retrieveByCategory("PC"));
	}

}
