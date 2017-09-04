package edu.practice.application.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import edu.practice.application.dao.CheckIdDAO;
import edu.practice.exception.BootException;

@Repository
public class CheckIdDAOImpl implements CheckIdDAO {

	@Autowired
	DataSource dataSource;

	@Value("${departments.sql}")
	private String departmentSql;

	@Override
	@Transactional
	public boolean checkId(Integer id) throws BootException {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		int value = 0;
		try {
			String sql = "select EMPLOYEE_ID from employees where EMPLOYEE_ID = ?";
			value = jdbcTemplate.queryForObject(sql, new Object[] { id }, Integer.class);
		} catch (EmptyResultDataAccessException dataAccessException) {
			throw new BootException("ID_NOT_FOUND", "Employee Id not found");
		}
		return value == 0 ? false : true;
	}

	@Override
	public Map<Integer, String> departments() {

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		Map<Integer,String> departmentMap = jdbcTemplate.query(departmentSql, new ResultSetExtractor<Map<Integer,String>>(){
			@Override
			public Map<Integer,String> extractData(ResultSet rs) throws SQLException, DataAccessException {
				Map<Integer,String> departmentData = new LinkedHashMap<Integer,String>();
				while(rs.next()){
					departmentData.put(rs.getInt(1), rs.getString(2));
				}
				return departmentData;
			}
		});
    	return departmentMap;
	}

}
