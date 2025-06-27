package com.product.service;
import com.product.model.Product;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.repository.IProductRepository;

@Service
public class ProductSericeImp implements IProductService {
	
	@Autowired
	private IProductRepository productRepository;

	@Override
	public void addProduct(Product product) {
		productRepository.save(product);

	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		


	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(int productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getById(int productId) {
		// TODO Auto-generated method stub

	}

}
