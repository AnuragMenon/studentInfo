package com.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;
import com.dao.StudentDao;
import com.entities.Student;

@Repository
@Transactional
public class StudentDaoImpl implements StudentDao {
@Autowired
SessionFactory session;
	
	public boolean saveOrUpdate(Student users) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(users);
		return true;
	}

	public List<Student> list() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	public boolean delete(Student users) {
		try{
			session.getCurrentSession().delete(users);
		}catch(Exception ex){
			return false;
		}	
		return true;
	}	
}
