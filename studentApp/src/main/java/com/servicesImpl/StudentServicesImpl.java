package com.servicesImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.daoImpl.StudentDaoImpl;
import com.entities.Student;
import com.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentDao studentDao; 
	
	public List<Student> list() {
		// TODO Auto-generated method stub
		return studentDao.list();
	}

	public boolean delete(Student users) {
		// TODO Auto-generated method stub
		return studentDao.delete(users);
	}

	public boolean saveOrUpdate(Student users) {
		// TODO Auto-generated method stub
		return studentDao.saveOrUpdate(users);
	}
	

	public List<Student> findAllUsers() {
		return studentDao.list();
	}
	
	public Student findById(long id) {
		return studentDao.findById(id);
	}
	
	public Student findByName(String name) {
		return studentDao.findByName(name);
	}
	
	public boolean saveUser(Student user) {
		return studentDao.saveUser(user);
	}

	public boolean updateUser(Student user) {
		return studentDao.updateUser(user);
	}

	public boolean deleteUserById(long id) {
		
		return studentDao.deleteUserById(id);
	}

	public boolean isUserExist(Student user) {
		return studentDao.isUserExist(user);
	}
	
	public boolean deleteAllUsers(){
		return studentDao.deleteAllUsers();
	}

	public boolean studentUser(String email, String password) {
		// TODO Auto-generated method stub
		return studentDao.studentUser(email,password);
	}

	

	
}
