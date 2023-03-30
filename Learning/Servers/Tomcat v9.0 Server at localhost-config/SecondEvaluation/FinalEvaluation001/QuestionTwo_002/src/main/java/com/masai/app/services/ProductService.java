package com.masai.app.services;

import java.util.List;


import com.masai.app.Exception.ProductException;

import com.masai.app.model.Product;



public interface ProductService {

	public Product createNewProduct(Product product) throws ProductException;
	public Product deleteProductById(Integer Id) throws ProductException;
	
}
