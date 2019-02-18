package com.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.hibernate.Query;
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

	List<Student> users = new ArrayList<Student>();

	public boolean studentUser(String email, String password) {
		// TODO Auto-generated method stub
		boolean userFound = false;
		String SQL_QUERY = "from student as o where o.email=? and o.password=?";
		Query query = session.getCurrentSession().createQuery(SQL_QUERY);
		System.out.println(query);
		query.setParameter(0, email);
		query.setParameter(1, password);
		List list = query.list();
		System.out.println(list);

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}

		return userFound;

	}

	public boolean saveOrUpdate(Student users) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(users);
		return true;
	}

	public List<Student> list() {
		return session.getCurrentSession().createQuery("from student").list();
	}

	public boolean delete(Student users) {
		try {
			session.getCurrentSession().delete(users);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	private static final AtomicLong counter = new AtomicLong();

	public List<Student> findAllUsers() {
		return session.getCurrentSession().createQuery("from Student").list();
	}

	public Student findById(long id) {
		for (Student user : users) {
			if (user.getStudentid() == id) {
				return user;
			}
		}
		return null;
	}

	public Student findByName(String name) {
		for (Student user : users) {
			if (user.getStudentName().equalsIgnoreCase(name)) {
				return user;
			}
		}
		return null;
	}

	public boolean saveUser(Student user) {
		// user.setStudentid(counter.incrementAndGet());
		// users.add(user);
		session.getCurrentSession().save(users);
		return true;
	}

	public boolean updateUser(Student user) {
		int index = users.indexOf(user);
		users.set(index, user);
		session.getCurrentSession().update(users);
		return true;
	}

	public boolean deleteUserById(long id) {

		for (Iterator<Student> iterator = users.iterator(); iterator.hasNext();) {
			Student user = iterator.next();
			if (user.getStudentid() == id) {
				iterator.remove();
			}
		}

		return true;
	}

	public boolean isUserExist(Student user) {
		return findByName(user.getStudentName()) != null;
	}

	public boolean deleteAllUsers() {
		users.clear();

		return true;
	}

}
