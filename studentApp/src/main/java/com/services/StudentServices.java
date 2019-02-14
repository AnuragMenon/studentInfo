package com.services;

import java.util.List;

import com.entities.Student;

public interface StudentServices {

	public List<Student> list();
	public boolean delete(Student users);
	public boolean saveOrUpdate(Student users);
	
	/*--------------------*/
	Student findById(long id);
	
	Student findByName(String name);
	
	public boolean saveUser(Student user);
	
	public boolean updateUser(Student user);
	
	public boolean deleteUserById(long id);

	public List<Student> findAllUsers(); 
	
	public boolean deleteAllUsers();
	
	public boolean isUserExist(Student user);
	
}
