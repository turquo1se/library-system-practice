package com.SpringApplication.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.SpringApplication.demo.dao.BookRepository;
import com.SpringApplication.demo.exception.BookNotFoundException;
import com.SpringApplication.demo.model.Book;
import com.SpringApplication.demo.model.BookRequest;

@Service
public class ServiceImpl implements IService{
	
	@Autowired
	BookRepository sRepository;

	@Override
	public void createBook(Book s) {
		sRepository.save(s);
		
	}

	@Override
	public List<Book> getBook() {
		return sRepository.findAll();
	}

	@Override
	public Book updateBook(Book s) {
		Book sOld = sRepository.findById(s.getId()).orElse(null);
		sOld.setAuthor(s.getAuthor());
		sOld.setTitle(s.getTitle());
		sOld.setCost(s.getCost());
		sRepository.save(sOld);
		return sOld;
	}

	@Override
	public void deleteBook(int id) {
		sRepository.deleteById(id);
		
	}

	@Override
	public Book createBookRequest(BookRequest bkReq){
		Book bk = Book.build(0, bkReq.getAuthor(), bkReq.getTitle(), bkReq.getCost());
		return sRepository.save(bk);
		
	}

}
