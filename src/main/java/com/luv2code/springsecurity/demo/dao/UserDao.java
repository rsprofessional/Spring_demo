package com.luv2code.springsecurity.demo.dao;

import java.util.List;
import com.luv2code.springsecurity.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);

	void deleteById(int theId);
	
	public User findById(int theId);

	public List<User> findAll();

	//public List<User> searchBy(String theUserName);
    
}
