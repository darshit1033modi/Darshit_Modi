package com.darshit.k2.repository;

import com.darshit.k2.dto.Admin;

public interface AdminDao {

	public String saveAdmin();
	
	public Admin adminLogin(String email, String password);
	
}
