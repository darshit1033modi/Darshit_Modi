package com.darshit.k2.dto;

import java.sql.Date;

import lombok.Data;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstuctor
@Data // everything it will generate getters, setters, no Arg constructor, parameterize constructor, hashCode, toString(in short all)
public class Visitor {
	
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String phone;
	
	private String gender;
	
	private Date dob;
	
	private Integer age;
	
	private String address;
	
	private String password;

	public Visitor(String name, String email, String phone, String gender, Date dob, Integer age,
			String address, String password) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.password = password;
	}

	public Visitor(Integer id, String name, String email, String phone, String gender, Date dob, Integer age,
			String address, String password) {
		super();
		this.id = id; 
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.address = address;
		this.password = password;
	}
	
	
	
	

}
