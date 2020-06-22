package com.techprimers.springboot.swaggerexample.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.springboot.swaggerexample.model.Book;

public interface BookRepository  extends  JpaRepository<Book, Integer>{
	
	//public Book save (Book book);

}
