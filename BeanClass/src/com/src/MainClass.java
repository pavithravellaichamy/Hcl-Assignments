package com.src;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ApplicationContext ac=new AnnotationConfigApplicationContext(ApplicationContextConfig.class);
		DataSource ds=(DataSource) ac.getBean("mysql");
		int ch;
		do  //menu card
		{
		System.out.println("1. Add employee");
		System.out.println("2. Delete employee");
		System.out.println("3. Update employee");
		System.out.println("4. Display employee");
		System.out.println("5. Exit");
		System.out.println("Enter your Choice");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			{
				Employee e=new Employee();
				System.out.println("Enter employee id");
				e.setEmp_ID(sc.nextInt());
				System.out.println("Enter employee name");
				e.setEmp_Name(sc.next());
				System.out.println("Enter employee salary");
				e.setEmp_Salary(sc.nextInt());
				Insert.employeeAdd(ds,e);
				break;
			}
			case 2:
			{
				System.out.println("Enter employee id to delete");
				int emp_ID=sc.nextInt();
				Delete.employeeDelete(ds,emp_ID);
				break;
			}
			case 3:
			{
				System.out.println("Enter employee id");
				int emp_ID =sc.nextInt();
				Update.employeeUpdate(ds,emp_ID);
				break;
			}
			case 4:
			{
				int value=1;
				Display.employeeDisplay(ds,value);
				break;
			}
			case 5:
				System.out.println("Exit");
				break;
		}
	}while(ch!=5);
	}
}
