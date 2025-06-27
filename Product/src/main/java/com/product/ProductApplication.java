package com.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.product.model.Product;
import com.product.service.IProductService;

@SpringBootApplication
public class ProductApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductApplication.class, args);
	}
	@Autowired
	private IProductService productService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Product product=new Product("Cooler","Navajeevan",5389.86);
		
		productService.addProduct(product);
	}

}
