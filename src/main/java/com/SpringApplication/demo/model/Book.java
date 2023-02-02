package com.SpringApplication.demo.model;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Book_TBL")
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Book {
	
	@Id
	@GeneratedValue
	private int id;
	private String author;
	private String title;
	private float cost;
	

	

}
