package com.src;

public class Employee 
{
	private int emp_ID;
	private String emp_Name;
	private int emp_Salary;
	public Employee()  //constructor without parameter
	{
		
	}
	public Employee(int emp_ID, String emp_Name, int emp_Salary) {  //constructor with parameter
		super();
		this.emp_ID = emp_ID;
		this.emp_Name = emp_Name;
		this.emp_Salary = emp_Salary;
	}
	public int getEmp_ID() {  //getter and setter methods
		return emp_ID;
	}
	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}
	public String getEmp_Name() {
		return emp_Name;
	}
	public void setEmp_Name(String emp_Name) {
		this.emp_Name = emp_Name;
	}
	public int getEmp_Salary() {
		return emp_Salary;
	}
	public void setEmp_Salary(int emp_Salary) {
		this.emp_Salary = emp_Salary;
	}
}
