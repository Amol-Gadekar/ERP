package com.erp.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.ManyToAny;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long studentId;
	@NotNull(message = "First Name cannot be NULL")
	private String fName;
	@NotNull(message = "Last Name cannot be NULL")
	private String lName;
	@Email(message = "Invalid Email")
	private String email;
	@Pattern (regexp =  "^\\d{10}$", message = "Invalid Phone Number")
	private String phoneNumber;
	@NotBlank
	private String city;
	
	@ManyToMany(mappedBy = "students")
	@JsonBackReference
	private List<Batch> batches = new ArrayList<>();
	
}
