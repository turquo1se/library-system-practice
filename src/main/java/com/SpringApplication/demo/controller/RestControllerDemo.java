package com.SpringApplication.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringApplication.demo.model.Book;
import com.SpringApplication.demo.service.IService;
import com.SpringApplication.demo.service.ServiceImpl;

@RestController
public class RestControllerDemo {
	
	@Autowired
	IService bookService;
	
	@PostMapping("/create")
	public void createBook(@RequestBody Book s) {
		bookService.createBook(s);
	}
	
	@GetMapping("/get")
	public List<Book> getBook() {
		return bookService.getBook();
	}

	
	@PutMapping("/update")
	public void updateBook(@RequestBody Book s) {
		bookService.updateBook(s);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable Integer id) {
		bookService.deleteBook(id);
	}
	

}
