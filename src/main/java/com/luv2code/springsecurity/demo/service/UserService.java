package com.luv2code.springsecurity.demo.service;


import com.luv2code.springsecurity.demo.entity.User;
import com.luv2code.springsecurity.demo.user.CrmUser;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(CrmUser crmUser);
	
	public void update(User theUser);

	void deleteById(int theId);
	
	public User findById(int theId);

	public List<User> findAll();
}
