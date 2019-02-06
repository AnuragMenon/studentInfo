package com.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDao;
import com.entities.Student;
import com.services.StudentServices;

@Service
public class StudentServicesImpl implements StudentServices {

	@Autowired
	
	StudentDao studentDao = new StudentDao() {
		
		public boolean saveOrUpdate(Student users) {
			// TODO Auto-generated method stub
			return false;
		}
		
		public List<Student> list() {
			// TODO Auto-generated method stub
			return null;
		}
		
		public boolean delete(Student users) {
			// TODO Auto-generated method stub
			return false;
		}
	};
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

	
}
