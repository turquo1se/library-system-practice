package com.SpringApplication.demo.service;

import java.util.List;
import java.util.Optional;

import com.SpringApplication.demo.model.Book;

public interface IService {
	
	public void createBook(Book s);
	
	public List<Book> getBook();
	
	public Book updateBook(Book s);
	
	public void deleteBook(int id);

}
