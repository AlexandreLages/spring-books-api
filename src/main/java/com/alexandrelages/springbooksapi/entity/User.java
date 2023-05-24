package com.alexandrelages.springbooksapi.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.alexandrelages.springbooksapi.enums.Gender;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	private UUID id;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private Integer age;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(nullable = false, unique = true, length = 100)
	private String email;
	
	@Column(nullable = false, unique = true, length = 20)
	private String username;
	
	@Column(nullable = false)
	private String password;

	@Column(nullable = false, columnDefinition = "TIMESTAMP")
	private LocalDate birthDate;
	
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Book> books;
	
}
