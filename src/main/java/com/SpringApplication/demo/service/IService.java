package com.SpringApplication.demo.service;

import java.util.List;
import java.util.Optional;

import com.SpringApplication.demo.exception.BookNotFoundException;
import com.SpringApplication.demo.model.Book;
import com.SpringApplication.demo.model.BookRequest;

public interface IService {
	
	public void createBook(Book s);
	
	public List<Book> getBook();
	
	public Book updateBook(Book s);
	
	public void deleteBook(int id);
	
	public Book createBookRequest(BookRequest bkReq);

}
