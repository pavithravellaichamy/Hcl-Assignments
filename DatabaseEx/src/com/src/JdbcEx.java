package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx
{
	public static void main(String[] args) 
	{
		String url="jdbc:mysql://localhost:3306/onlinefoodordering";
		String user="root";
		String password="pass1234";
		try(Connection con=DriverManager.getConnection(url,user,password))
		{
			Class.forName("com.mysql.jdbc.Driver");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Restaurants");
			while(rs.next())
			{
				System.out.println(rs.getInt("RestaurantID")+"  |  "+rs.getString("RestaurantName")+"  |  "+rs.getString("RestaurantAddress")+" | "+rs.getString("Restaurantity")+" | "+rs.getLong("ContactNo"));
			}
			System.out.println("Completed");
		}
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}

}
