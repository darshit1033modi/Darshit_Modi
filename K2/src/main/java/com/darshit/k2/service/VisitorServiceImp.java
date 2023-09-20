package com.darshit.k2.service;

import java.util.List;

import com.darshit.k2.dto.Visitor;
import com.darshit.k2.repository.VisitorDao;
import com.darshit.k2.repository.VisitorDaoImp;
import com.darshit.k2.util.AES;
import com.darshit.k2.util.AppConstatnts;

public class VisitorServiceImp implements VisitorService {

	private VisitorDao dao;
	
	{
		dao = new VisitorDaoImp();
	}
	
	
	@Override
	public String saveVisitor(Visitor visitor) {
		
		String encEmail = AES.encrypt(visitor.getEmail(), AppConstatnts.SECRET_KEY);
		String encPhone = AES.encrypt(visitor.getPhone(), AppConstatnts.SECRET_KEY);
		String encAddress = AES.encrypt(visitor.getAddress(), AppConstatnts.SECRET_KEY);
		String encPassword = AES.encrypt(visitor.getPassword(), AppConstatnts.SECRET_KEY);
		
		visitor.setEmail(encEmail);
		visitor.setPhone(encPhone);
		visitor.setAddress(encAddress);
		visitor.setPassword(encPassword);
		
		return dao.saveVisitor(visitor);
	}

	@Override
	public String updateVisitor(Visitor visitor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor getVisitorById(int id) {

		Visitor visitor = dao.getVisitorById(id);
		
		AES.decrypt(visitor.getEmail(), AppConstatnts.SECRET_KEY);
		AES.decrypt(visitor.getPhone(), AppConstatnts.SECRET_KEY);
		AES.decrypt(visitor.getAddress(), AppConstatnts.SECRET_KEY);
		AES.decrypt(visitor.getPassword(), AppConstatnts.SECRET_KEY);
		
		
		return visitor;
	}

	@Override
	public Visitor deleteVisitorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getAllRegisteredVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> getAllValidVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Visitor visitorLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> validVisitorSortedByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> validVisitorSortedByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> registeredVisitorSortedByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Visitor> registeredVisitorSortedByEmail() {
		// TODO Auto-generated method stub
		return null;
	}

}
