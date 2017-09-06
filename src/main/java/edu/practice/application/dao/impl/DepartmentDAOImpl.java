package edu.practice.application.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import edu.practice.application.dao.DepartmentDAO;
import edu.practice.application.model.Details;

@Repository
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	DataSource dataSource;

	@Value("${details.sql}")
	String detailSql;

	@Override
	public Details getDetails(Integer deptNo) {

    	JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		Details details = jdbcTemplate.queryForObject(detailSql, new Object[] { deptNo }, new RowMapper<Details>(){

			@Override
			public Details mapRow(ResultSet rs, int arg1) throws SQLException {

				Details detail = new Details();

				detail.setAddress(rs.getString("STREET_ADDRESS"));
				detail.setCity(rs.getString("CITY"));
				detail.setPostalCode(rs.getString("POSTAL_CODE"));
				detail.setRegion(rs.getString("REGION_NAME"));
				detail.setState(rs.getString("STATE_PROVINCE"));
				detail.setCountry(rs.getString("COUNTRY_NAME"));

				return detail;
			}

		});

		return details;
	}


}
