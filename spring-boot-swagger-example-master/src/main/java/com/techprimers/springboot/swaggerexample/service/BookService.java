package com.techprimers.springboot.swaggerexample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techprimers.springboot.swaggerexample.dao.BookRepository;
import com.techprimers.springboot.swaggerexample.model.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository bookrepo;

	public String savebook(Book book) {
	bookrepo.save(book);
		return "book sqve wit D" + book.getBookId();

	}

	public Book getBook(int bookId) {
		return bookrepo.findOne(bookId);
	}

	public List<Book> removeBook(int bookId) {
		bookrepo.delete(bookId);
		return bookrepo.findAll();
	}
}
