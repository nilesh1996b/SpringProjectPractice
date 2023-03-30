package com.masai.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "Employee ID is Mandatory")
	private Integer id;
	private String name;
	private Integer price;
    private String brand;
    private String category;
	private String registration_number;
	private String manufacturer_id;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(@NotNull(message = "Employee ID is Mandatory") Integer id, String name, Integer price, String brand,
			String category, String registration_number, String manufacturer_id) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.category = category;
		this.registration_number = registration_number;
		this.manufacturer_id = manufacturer_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getRegistration_number() {
		return registration_number;
	}
	public void setRegistration_number(String registration_number) {
		this.registration_number = registration_number;
	}
	public String getManufacturer_id() {
		return manufacturer_id;
	}
	public void setManufacturer_id(String manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", category="
				+ category + ", registration_number=" + registration_number + ", manufacturer_id=" + manufacturer_id
				+ "]";
	}
	
	


	
	
}
