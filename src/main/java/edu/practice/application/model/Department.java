package edu.practice.application.model;

import java.util.Map;

public class Department {

	private Integer id;
	private Integer deptId;
	private String deptName;
	private Map<Integer,String> departments;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Map<Integer, String> getDepartments() {
		return departments;
	}
	public void setDepartments(Map<Integer, String> departments) {
		this.departments = departments;
	}


}
