package com.luv2code.springsecurity.demo.dao;

import java.util.List;
import com.luv2code.springsecurity.demo.entity.User;
import com.luv2code.springsecurity.demo.entity.User2;

public interface UserDao {

    public User findByUserName(String userName);
    
    //NEW METHOD ****************
    public User2 findByUserName2(String userName2);
    
    public void save(User user);

	void deleteById(int theId);
	
	public User findById(int theId);

	public List<User> findAll();

	//public List<User> searchBy(String theUserName);
    
}
