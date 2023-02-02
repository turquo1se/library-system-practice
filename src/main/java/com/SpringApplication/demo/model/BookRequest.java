package com.SpringApplication.demo.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class BookRequest {
	
	@Pattern(regexp = "^\\d{7}$", message = "invalid author name")
	private String author;
	private String title;
	@NotBlank(message = "cant be empty")
	private float cost;

}
