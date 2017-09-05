package edu.practice.application.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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

	@Value("{${details.sql}}")
	String detailSql;

	@Override
	public Details getDetails(Integer deptNo) {

		System.out.println("dhere " + detailSql);

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

		List<Details> details = jdbcTemplate.query(detailSql, new Object[] { deptNo }, new RowMapper<Details>(){

			@Override
			public Details mapRow(ResultSet rs, int arg1) throws SQLException {

				Details detail = new Details();

				detail.setAddress("STREET_ADDRESS");
				detail.setCity("CITY");
				detail.setPostalCode("POSTAL_CODE");
				detail.setRegion("REGION_NAME");
				detail.setSupervisor("SUPERVISOR");
				detail.setState("STATE_PROVINCE");
				detail.setCountry("COUNTRY_NAME");

				return detail;
			}

		});

		System.out.println(details);

		return details.get(0);
	}


}
