package com.alexandrelages.springbooksapi.entity;

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
public class Author extends Auditable {

	@Id
	private UUID id;
	
	@Column(nullable = false, unique = true)
	private String name;

	@Column(columnDefinition = "integer default 0")
	private Integer age;
	
	@OneToMany(mappedBy = "author", fetch = FetchType.LAZY)
	private List<Book> books;
	
}
