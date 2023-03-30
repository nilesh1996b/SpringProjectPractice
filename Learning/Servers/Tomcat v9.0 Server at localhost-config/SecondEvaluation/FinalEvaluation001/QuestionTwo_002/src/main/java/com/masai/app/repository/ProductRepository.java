package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.masai.app.model.Product;





@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
