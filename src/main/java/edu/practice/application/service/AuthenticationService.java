package edu.practice.application.service;

import edu.practice.exception.BootException;


public interface AuthenticationService {

	public boolean authenticate(Integer id) throws BootException;

}
