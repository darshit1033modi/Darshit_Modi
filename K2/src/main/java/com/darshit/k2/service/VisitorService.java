package com.darshit.k2.service;

import java.util.List;

import com.darshit.k2.dto.Visitor;

public interface VisitorService {
	
public String saveVisitor(Visitor visitor);
	
	public String updateVisitor(Visitor visitor);
	
	public Visitor getVisitorById(int id);
	
	public Visitor deleteVisitorById(int id);
	
	public List<Visitor> getAllRegisteredVisitor();
	
	public List<Visitor> getAllValidVisitor();
	
	public Visitor visitorLogin(String email, String password);

	public List<Visitor> validVisitorSortedByName();
	
	public List<Visitor> validVisitorSortedByEmail();
	
	public List<Visitor> registeredVisitorSortedByName();
	
	public List<Visitor> registeredVisitorSortedByEmail();

}
