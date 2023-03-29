package com.masai.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Product;
import com.masai.app.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pService;
	
	@PostMapping("/products")
	public ResponseEntity<Product> registerEmp(@RequestBody Product product)
	{
		Product addedProduct = pService.createNewProduct(product);
		
		return new ResponseEntity<>(addedProduct, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/product/{ifd}")
	public ResponseEntity<Product> deleteEmployee(@PathVariable("id") Integer id)
	{
		Product emp = pService.deleteProductById(id);
		
		return new ResponseEntity<>(emp, HttpStatus.ACCEPTED);
	}
	
}
