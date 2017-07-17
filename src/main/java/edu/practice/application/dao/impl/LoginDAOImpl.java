package edu.practice.application.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import edu.practice.application.dao.LoginDAO;
import edu.practice.application.model.User;

@Repository
public class LoginDAOImpl implements LoginDAO {

	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public boolean validateUser(User user) {

		return false;
	}


}
