package com.product.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor

@Data		//it's a combo of (@Setter+@Getter+@ToString) from lombok 
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Integer productId;
	String productName;
	String brand;
	Double price;
	
	public Product(String productName, String brand, Double price) {
		super();
		this.productName = productName;
		this.brand = brand;
		this.price = price;
	}

}
