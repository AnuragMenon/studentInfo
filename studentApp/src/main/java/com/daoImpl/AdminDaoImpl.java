package com.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dao.AdminDao;

@Repository
@Transactional
public class AdminDaoImpl implements AdminDao {
	@Autowired	
	SessionFactory session;
  /*  protected SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
           this.sessionFactory = sessionFactory;
    }
   
    protected Session getSession(){
           return sessionFactory.openSession();
    }

*/
	public boolean adminUser(String userName, String adminPassword) {
		// TODO Auto-generated method stub

		System.out.println("In Check login");

		boolean userFound = false;
		// Query using Hibernate Query Language
						
		
		//Session session = sessionFactory.openSession();
		String SQL_QUERY = "from student where userName=? and adminPassword=?";
		//String SQL_QUERY = "select a.userName, a.adminPassword from admin a";
		Query query = session.getCurrentSession().createQuery(SQL_QUERY);
	//	System.out.println(query);
		query.setParameter(0, userName);
		query.setParameter(1, adminPassword);
		List list = query.list();
		//System.out.println(list);

		if ((list != null) && (list.size() > 0)) {
			userFound = true;
		}
		 
		//session.close();
		return userFound;

	}
}
