package com.masai.app.services;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.Exception.ProductException;
import com.masai.app.model.Product;
import com.masai.app.repository.ProductRepository;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository pRepo;

	@Override
	public Product createNewProduct(Product product) throws ProductException {
		Product pro = pRepo.save(product);
		
		if(pro != null)
		{
		return pro;
		}else throw new ProductException("Product Not Added");
	}
	
//	------------------------------------------



	@Override
	public Product deleteProductById(Integer id) throws ProductException {
		Optional<Product> opt = pRepo.findById(id);
		if(opt.isPresent())
		{
			Product emp = opt.get();
			pRepo.delete(emp);
			return emp;
		}else throw new ProductException("There is no product with id " + id);
	}
	
	








}
