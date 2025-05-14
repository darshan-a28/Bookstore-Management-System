package com.jsp.BookStoreManagement.CONTROLLER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.BookStoreManagement.DTO.BookStore;
import com.jsp.BookStoreManagement.SERVICE.BookStoreService;

@RestController
public class BookStoreController 
{
	
	@Autowired
	BookStoreService service;
	
	//REST API to insert Book object into DB
	@PostMapping("/books")
	public BookStore storeBooks(@RequestBody BookStore bookStore)
	{
		return service.insertBook(bookStore);
	}
	
	
	//REST API to retrieve all weather objects from DB
	
	@GetMapping("/allbooks")
	public List<BookStore> displayAllBooks()
	{
		return service.getAllBooks();
	}
	
	//REST API to fetch books based on id
	
	@GetMapping("/getbooks")
	public BookStore getBookByID(@RequestParam int id)
	{
		return service.getBooksById(id);
	}
	
	//REST API to update the books details based on ID
	
	@PutMapping("/books")
	public String updateBooks(@RequestParam int id, @RequestParam String title, @RequestParam String pub, @RequestParam double price, @RequestParam int quan)
	{
		
		return service.updateBooks(id, title, pub, price, quan);
	}
	
	//REST API to delete the book details based on Id
	@DeleteMapping("/books")
	public String deleteBook(@RequestParam int id)
	{
		return service.deleteBook(id);
	}
	
	
	//REST API to fetch the details based on title 
	@GetMapping("/booktitle")
	public List<BookStore> getBookByTitle(@RequestParam String title)
	{
		return service.getByTitle(title);
	}
	
	@GetMapping("/price")
	public List<BookStore> getBookByPrice(@RequestParam double price)
	{
		return service.getbookByPrice(price);
	}
}
