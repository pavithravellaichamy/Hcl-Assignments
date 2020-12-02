/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
public class EmployeeEx 
{
	String name;
	int id;
	int salary;
	int experience;
	int age;
	public EmployeeEx(String name, int id, int salary, int experience, int age) {  //constructor with parameters
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.experience = experience;
		this.age = age;
	}

	@Override
	public String toString() {  //to display values
		return "EmployeeEx [name=" + name + ", id=" + id + ", salary=" + salary + ", experience=" + experience + "]";
	}

	public boolean equals(Object obj) {  //to avoid duplicates
		EmployeeEx other = (EmployeeEx) obj;
		if (id != other.id)
			return false;
		return true;
	}
}

