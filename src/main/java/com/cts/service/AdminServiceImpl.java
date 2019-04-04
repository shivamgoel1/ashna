package com.cts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cts.dao.AdminDAO;
import com.cts.entity.Admin;
import com.cts.entity.Customer;

@Service("adminService")
public class AdminServiceImpl implements AdminService{

	@Autowired
	  private AdminDAO adminDAO;
	
	@Override
	@Transactional
	public void registerUser(Admin admin) {
		// TODO Auto-generated method stub
		adminDAO.registerUser(admin);
	}

	@Override
	@Transactional
	public Admin getAdmin(String p) {
		// TODO Auto-generated method stub
		Admin admin=adminDAO.getAdmin(p);
		return admin;
	}
	
	

}
