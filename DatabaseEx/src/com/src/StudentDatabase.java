package com.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentDatabase 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String url="jdbc:mysql://localhost:3306/student";
		String user="root";
		String password="pass1234";
		Connection con=null;
		if(DriverManager.getConnection(url,user,password) != null)
		{
			con=DriverManager.getConnection(url,user,password);
			Class.forName("com.mysql.jdbc.Driver");
			Statement st=con.createStatement();
			System.out.println("Welcome to Student Management System");
			Scanner sc=new Scanner(System.in);
			int ch;
			ResultSet rs=null;
			try
			{
				rs=st.executeQuery("select * from StudentDetails");
			}
			catch(Exception e)
			{
				st.execute("create table StudentDetails(StudentId int,StudentName varchar(20),StudentGrade varchar(10),StudentTotal int)");
				System.out.println("Table Created");
			}
			do 
			{
				System.out.println("1. Add Student");
				System.out.println("2. Remove Student");
				System.out.println("3. Update Student");
				System.out.println("4. Display Student");
				System.out.println("5. Logout");
				System.out.println("Enter your choice : ");
				ch=sc.nextInt();
			switch(ch)
			{
			case 1:
			{
				System.out.println("Enter Id : ");
				int StudentId=sc.nextInt();
				System.out.println("Enter Name : ");
				String StudentName=sc.next();
				System.out.println("Enter Grade : ");
				String StudentGrade=sc.next();
				System.out.println("Enter Total : ");
				int StudentTotal=sc.nextInt();
				int i=st.executeUpdate("insert into StudentDetails values("+StudentId+",'"+StudentName+"','"+StudentGrade+"',"+StudentTotal+")");
				if(i>0)
				{
				System.out.println("Added Successfully");
				}
				break;
			}
			case 2:
			{
				System.out.println("Enter Id to remove : ");
				int id=sc.nextInt();
				int j= st.executeUpdate("delete from StudentDetails where StudentId="+id+"");
				System.out.println("Removed Successfully");
				break;
			}
			case 3:
			{
				System.out.println("Enter Id to update : ");
				int id=sc.nextInt();
				System.out.println("Enter Name : ");
				String SName=sc.next();
				System.out.println("Enter Grade : ");
				String SGrade=sc.next();
				System.out.println("Enter Total : ");
				int STotal=sc.nextInt();
				int k=st.executeUpdate("update StudentDetails set StudentName='"+SName+"',StudentGrade='"+SGrade+"',StudentTotal="+STotal+" where StudentId="+id+"");
				System.out.println(k);
				break;
			}
			case 4:
			{
				ResultSet rs1=st.executeQuery("select * from StudentDetails");
				while(rs1.next())
				{
					System.out.println(rs1.getInt("StudentId")+"  |  "+rs1.getString("StudentName")+"  |  "+rs1.getString("StudentGrade")+"  |  "+rs1.getInt("StudentTotal"));
				}
				break;
			}
			case 5:
			{
				System.out.println("Logout");
				break;
			}
		}
	}while(ch!=5);
    }
	}
}
