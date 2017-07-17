package edu.practice.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.practice.application.dao.LoginDAO;
import edu.practice.application.model.User;
import edu.practice.application.service.AuthenticationService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private LoginDAO loginDAO;


	@Override
	public boolean authenticate(User user) {
		loginDAO.validateUser(user);
		return false;
	}

}
