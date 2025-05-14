package com.jsp.BookStoreManagement.SERVICE;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.BookStoreManagement.DTO.BookStore;
import com.jsp.BookStoreManagement.REPOSITORY.BookStoreRepository;

@Service
public class BookStoreService 
{
	@Autowired
	BookStoreRepository repository;
	
	//to insert the book objects into db
	public BookStore insertBook(BookStore bookStore)
	{
		return repository.save(bookStore);
	}
	
	
	
	//to fetch all books objects from db
	public List<BookStore> getAllBooks()
	{
		return repository.findAll();
	}
	
	
	 // to fetch books based on ID
	public BookStore getBooksById(int id)
	{
		Optional<BookStore> opt	=repository.findById(id);
		if(opt != null)
			return opt.get();
		else
			return null;
		
	}
	
	// to update the books details
	
	public String updateBooks(int id, String newTitle, String newPublisher, double newPrice, int newQuantity)
	{
		BookStore b= getBooksById(id);
		if(b != null)
		{
			b.setTitle(newTitle);
			b.setPublisher(newPublisher);
			b.setPrice(newPrice);
			b.setQuantity(newQuantity);
			repository.save(b);
			return "Books details are update for ID:"+id+" Successfully..";
		}
		else
			return "Book doesnt exist for this ID:"+id;
	}
	
	
	//to delete book details based on id
	public String deleteBook(int id)
	{
		BookStore b= getBooksById(id);
		
		if(b != null)
		{
			repository.delete(b);
			//or
			//repository.deleteById(id);
			return "Book details are deleted Succefully for ID: "+id;
		}
		else
			return "Book doesnt exist for ID: "+id;
	}
	
	// to fetch book details based on Title
	
	public List<BookStore> getByTitle(String title)
	{
		return repository.findByTitle(title);
	}
	
	// to fetch the book details more than 150
	public List<BookStore> getbookByPrice(double price)
	{
		return repository.priceGreater(price);
	}
	
}
