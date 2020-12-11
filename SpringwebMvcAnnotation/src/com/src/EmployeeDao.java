package com.src;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao 
{
	private JdbcTemplate jdbctemplate;

	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}	
	
	public int saveEmp(Employee e)
	{
		String query="insert into Employee values("+e.getEmp_ID()+",'"+e.getEmp_Name()+"',"+e.getEmp_Salary()+")";
		return jdbctemplate.update(query);
	}
	
	public int deleteEmp(Employee e)
	{
		String sql="delete from Employee where emp_ID="+e.getEmp_ID();
		return jdbctemplate.update(sql);		
	}
	
	public int updateEmp(Employee e)
	{
		String query="update Employee set emp_Name='"+e.getEmp_Name()+"',emp_Salary="+e.getEmp_Salary()+" where emp_ID="+e.getEmp_ID()+"";
		return jdbctemplate.update(query);
	}
	
	public List<Employee> getAllEmployee()
	{
		String sql="select * from Employee";
		 return jdbctemplate.query(sql,new RowMapper<Employee>(){
			public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				
				Employee e1=new Employee();
				e1.setEmp_ID(rs.getInt(1));
				e1.setEmp_Name(rs.getString(2));
				e1.setEmp_Salary(rs.getInt(3));
				return e1;
		}
		});	
	}
}
