package edu.practice.application.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.practice.application.dao.DepartmentDAO;
import edu.practice.application.model.Details;
import edu.practice.application.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	DepartmentDAO departmentDAO;

	@Override
	public Details getDetails(Integer deptNo) {
     	return departmentDAO.getDetails(deptNo);
	}

}
