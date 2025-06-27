package com.product.service;

import java.util.List;

import com.product.model.Product;

public interface IProductService {
	public void addProduct(Product product);
	public void updateProduct(Product product);
	List<Product> getAllProducts();
	public void deleteProduct(int productId);
	public void getById(int productId);

}
