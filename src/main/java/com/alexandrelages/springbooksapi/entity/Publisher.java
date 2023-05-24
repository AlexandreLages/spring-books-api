package com.alexandrelages.springbooksapi.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Publisher {

	@Id
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	@Column(nullable = false, unique = true, length = 100)
	private String code;
	
	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate foundationDate;
	
	@OneToMany(mappedBy = "publisher", fetch = FetchType.LAZY)
	private List<Book> books;
	
}
