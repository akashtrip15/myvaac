package com.myvaac.vaccination.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name ="USER")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "COUNTRY")
	private String country;
	
	@Column(name = "MOBILE")
	private int mobile;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "Password")
	private String password;
	
	@Column(name = "WEIGHT")
	private int weight;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "AGE")
	private int age;
	
	@Transient
	private String confirmPassword;
}
