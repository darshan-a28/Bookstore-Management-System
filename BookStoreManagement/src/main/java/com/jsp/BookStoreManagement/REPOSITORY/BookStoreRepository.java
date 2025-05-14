package com.jsp.BookStoreManagement.REPOSITORY;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jsp.BookStoreManagement.DTO.BookStore;

public interface BookStoreRepository extends JpaRepository<BookStore, Integer>
{

	
	//JPQL QUERY to retrieve books by title
	@Query("select b from BookStore b where b.title=?1")
	public List<BookStore> findByTitle(String title);
	
	//JPQL Query to retrieve books whose price is greater than 150
	@Query("select b from BookStore b where b.price>?1")
	public List<BookStore> priceGreater(double price);
}
