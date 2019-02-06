package com.services;

import java.util.List;

import com.entities.Student;

public interface StudentServices {

	public List<Student> list();
	public boolean delete(Student users);
	public boolean saveOrUpdate(Student users);
}
