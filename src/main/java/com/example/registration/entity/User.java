package com.example.registration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="registrationdb")
public class User {
	
	 @Id
	 @GeneratedValue
	  private int id;
	 
	  private String firstname;
	  
	  private String lastname;
	  
	  private String emailid;
	  
	  private int phonenumber;
	  
	  private String password;
	  
	  private String confirmpassword;

	
	
	
	}
	

