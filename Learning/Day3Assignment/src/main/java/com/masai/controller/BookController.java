package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import jakarta.annotation.PostConstruct;

@RestController
public class BookController {
	
	List<Books> books = new ArrayList<>();
	
	@PostConstruct
	public void postAddingBook()
	{

		books.add(new Books(1,"Book1","author1","publication1","category1",1000,100,1));
		books.add(new Books(2,"Book2","author2","publication2","category2",2000,200,1));
		books.add(new Books(3,"Book3","author3","publication3","category3",3000,300,1));
		books.add(new Books(4,"Book4","author4","publication4","category4",4000,400,1));
		books.add(new Books(5,"Book5","author5","publication5","category5",5000,500,1));

	}
	
//	Question One ---------------------------------------------------------------------------------->
	
	@GetMapping("/books")
	public List<Books> getBooks()
	{
		return books;
	}

//	Question Two ---------------------------------------------------------------------------------->
	
	@GetMapping("/books/{id}")
	public Books getBookById(@PathVariable("id")Integer id)
	{
		Books book = null;
		
			for(Books e:books)
			{
				if(e.getId()==id)
				{
					book = e;
				}
			}
		
		return book;
	}

//	Question Three ---------------------------------------------------------------------------------->
	
	@PostMapping("/bookservice")
	public String addNewBook(@RequestBody Books book)
	{
		String str = "Not Added";
		
		books.add(book);
		str = "Added Successfully";
		
		return str;
	}
	
	@DeleteMapping("/bookservice/{id}")
	public String removeBookById(@PathVariable("id")Integer id)
	{
		String message = "Not Removed";
		Books book = null;
		
			for(Books e:books)
			{
				if(e.getId()==id)
				{
					book = e;
				}
			}
		
			books.remove(book);
			
		return "Removed";
	}
//	Question Four ---------------------------------------------------------------------------------->
	
	@DeleteMapping("/bookservice/{id}")
	public String deleteStudentHandler(@PathVariable("id")Integer id)
	{
		boolean flag = true;
		Books s = null;
		
		for(int i =0; i<books.size(); i++ )
		{
			if(books.get(i).getId()==id)
			{
				books.remove(i);
				flag = false;
				break;
			}
		}
		
		
		if(!flag)
		{
			return "Book Deleted Sucessfully..";
		}else
		{
			throw new IllegalArgumentException("Book does not exist with id : " + id);
		}
		
	}
	
	@PutMapping("/bookservice/{id}")
	public Books updateBookHandler(@RequestBody Books book, @PathVariable("id") Integer id)
	{
		boolean flag = true;
		for(int i = 0; i<books.size(); i++)
		{
			if(books.get(i).getId()==id)
			{
				Books existingBook = books.get(i);
//				existingBook = book;
				
				existingBook.setName(book.getName());
				existingBook.setAuthor(book.getAuthor());
				existingBook.setPublication(book.getPublication());
				existingBook.setCategory(book.getCategory());
				existingBook.setPages(book.getPages());
				existingBook.setPrice(book.getPrice());
				existingBook.setAuthor_no(book.getAuthor_no());
				
				flag = false;
				book = existingBook;
			}
		}
		
		if(flag)
		{
			throw new IllegalArgumentException("Book does not exist with id : " + id);
		}
		
		return book;
	}
	
}
