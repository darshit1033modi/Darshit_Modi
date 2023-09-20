package com.darshit.k2.repository;

import java.util.List;

import com.darshit.k2.dto.Visitor;

public interface VisitorDao {
	
	public String saveVisitor(Visitor visitor);
	
	public String updateVisitor(Visitor visitor);
	
	public Visitor getVisitorById(int id);
	
	public Visitor deleteVisitorById(int id);
	
	public List<Visitor> getAllRegisteredVisitor();
	
	public List<Visitor> getAllValidVisitor();
	
	public Visitor visitorLogin(String email, String password);

}
