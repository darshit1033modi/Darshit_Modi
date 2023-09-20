package com.darshit.k2.controller;

import java.sql.Date;
import java.time.LocalDate;

public class AppController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dob = null;;
		dob = Date.valueOf(LocalDate.of(1998, 10, 05));
//		dob = Date.valueOf("2000-06-15");
		System.out.println(dob);
	}

}
