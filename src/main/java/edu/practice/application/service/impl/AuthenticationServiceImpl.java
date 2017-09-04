package edu.practice.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.practice.application.dao.CheckIdDAO;
import edu.practice.application.service.AuthenticationService;
import edu.practice.exception.BootException;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	CheckIdDAO checkIdDAO;

	@Override
	public boolean authenticate(Integer id) throws BootException {
		return checkIdDAO.checkId(id);
	}

}
