package com.alexandrelages.springbooksapi.entity;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Book {

	@Id
	private UUID id;
	
	@Column(nullable = false, length = 100)
	private String name;
	
	@Column(nullable = false)
	private String isbn;
	
	@Column(columnDefinition = "integer default 0")
	private Integer pages;
	
	@Column(columnDefinition = "integer default 0")
	private Integer chapters;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Author author;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private Publisher publisher;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private User user;
	
}
