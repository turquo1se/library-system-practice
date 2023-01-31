package com.SpringApplication.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue
	private int id;
	private String author;
	private String title;
	private float cost;
	
	public Book() {
		super();
	}
	
	@Autowired
	public Book(int id, String author,String title, float cost) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	
	

}
