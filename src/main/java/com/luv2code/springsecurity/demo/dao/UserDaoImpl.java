package com.luv2code.springsecurity.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.luv2code.springsecurity.demo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManager entityManager;

	@Override
	@Transactional
	public User findByUserName(String theUserName) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// now retrieve/read from database using username
		Query<User> theQuery = currentSession.createQuery("from User where userName=:uName", User.class);
		theQuery.setParameter("uName", theUserName);
		User theUser = null;
		try {
			theUser = theQuery.getSingleResult();
		} catch (Exception e) {
			theUser = null;
		}

		return theUser;
	}

	@Override
	@Transactional
	public void save(User theUser) {
		// get current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);

		// create the user ... finally LOL
		currentSession.saveOrUpdate(theUser);
	}
	
	@Override
	@Transactional
	public void deleteById(int theId) {
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<User> theQuery= currentSession.createQuery("delete from User where id=:userId");
		theQuery.setParameter("userId", theId);
		theQuery.executeUpdate();		
	}
	
	@Override
	@Transactional
	public User findById(int theId) {
		
		// get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//get the employee
		User theUser= currentSession.get(User.class,theId);
		
		// return the employee		
		return theUser;
	}
	
	@Override
	@Transactional
	public List<User> findAll() {
			
		//get the Hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		//create a query
		Query<User> theQuery= currentSession.createQuery("from User", User.class);
		
		//execute query and get the result list
		List<User> employeesusers = theQuery.getResultList();
		
		//return the results
		return  employeesusers;
	}

}
