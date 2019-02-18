package com.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AdminDao;
import com.services.AdminServices;

@Service
public class AdminServicesImpl implements AdminServices {

	@Autowired
	AdminDao adminDao; 
	
	public boolean adminUser(String userName, String adminPassword) {
		// TODO Auto-generated method stub
		return adminDao.adminUser(userName,adminPassword);
	}

}
