package com.SpringApplication.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringApplication.demo.model.Book;



public interface BookRepository extends JpaRepository<Book, Integer> {
	// Book findByName(String name);
	

}
