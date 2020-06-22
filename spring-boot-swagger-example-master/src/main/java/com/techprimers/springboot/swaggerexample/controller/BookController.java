package com.techprimers.springboot.swaggerexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techprimers.springboot.swaggerexample.model.Book;
import com.techprimers.springboot.swaggerexample.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	
	@Autowired
	private BookService bookservice;

	@PostMapping("/save")
	public String SaveBook(@RequestBody Book book) {
		return bookservice.savebook(book);
	}

	@GetMapping("/searchbook/{bookId}")
	public Book getBook(@PathVariable int bookId) {
		return bookservice.getBook(bookId);

	}

	@DeleteMapping("/deletebook/{bookId}")
	public List<Book> deleteBook(@PathVariable int bookId)

	{
		return bookservice.removeBook(bookId);
	}
}
