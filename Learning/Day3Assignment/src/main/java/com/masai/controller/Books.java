package com.masai.controller;

public class Books {
	private Integer id;
	private String name;
	private String author;
	private String publication;
	private String category;
	private Integer pages;
	private Integer price;
	private Integer author_no;
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Books(Integer id, String name, String author, String publication, String category, Integer pages,
			Integer price, Integer author_no) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publication = publication;
		this.category = category;
		this.pages = pages;
		this.price = price;
		this.author_no = author_no;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getAuthor_no() {
		return author_no;
	}
	public void setAuthor_no(Integer author_no) {
		this.author_no = author_no;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", author=" + author + ", publication=" + publication
				+ ", category=" + category + ", pages=" + pages + ", price=" + price + ", author_no=" + author_no + "]";
	}
	
	
}
