package edu.practice.application.dao;

import java.util.Map;

import edu.practice.exception.BootException;


public interface CheckIdDAO {

	public boolean checkId(Integer id) throws BootException;

	public Map<Integer,String> departments();

}
