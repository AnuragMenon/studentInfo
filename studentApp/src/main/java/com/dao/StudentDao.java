package com.dao;

import java.util.List;
import com.entities.Student;
public interface StudentDao {
	
	public List<Student> list();
	public boolean delete(Student users);
	public boolean saveOrUpdate(Student users);

}
