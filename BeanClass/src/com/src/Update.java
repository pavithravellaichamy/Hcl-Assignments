package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update
{
	public static void employeeUpdate(DataSource ds,int emp_ID) throws SQLException, ClassNotFoundException
	{
		Connection con=DriverManager.getConnection(ds.getUrl(),ds.getUsername(),ds.getPassword());  //establishing the connection
		Class.forName(ds.getDriverclass());
		Statement st=con.createStatement();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name");
		String emp_Name=sc.next();
		System.out.println("Enter employee salary");
		int emp_Salary=sc.nextInt();
		int k=st.executeUpdate("update Employee set emp_Name='"+emp_Name+"',emp_Salary="+emp_Salary+" where emp_ID="+emp_ID+"");  //updating content to the table
		System.out.println("Updated Successfully");
	}

}
