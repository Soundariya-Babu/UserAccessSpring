package com.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.model.UserAccess;

@Repository
public class UserAccessDAOImpl implements UserAccessDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void registerUser(UserAccess user) {
		
	   Session session = sessionFactory.getCurrentSession();
			      Transaction tx=session.beginTransaction();
			      session.persist(user);
			    tx.commit();
			      session.close();
			    	}

	@Override
	public UserAccess getUserById(Integer id) {
		Session session = sessionFactory.getCurrentSession();
	      Transaction tx=session.beginTransaction();
	     UserAccess user=(UserAccess) session.get(UserAccess.class, id);
	    tx.commit();
	      session.close();
		return user;
	
	}

	

}
