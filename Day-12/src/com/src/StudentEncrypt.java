/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
public class StudentEncrypt 
{
	String name;
	String id;
	String grade;
	String address;
	public StudentEncrypt(String name, String id, String grade, String address) {  //constructors with parameters
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public boolean equals(Object obj) {  //checking for duplicate values
		StudentEncrypt other = (StudentEncrypt) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {  //displaying the values
		return "name=" + name + ", id=" + id + ", grade=" + grade + ", address=" + address;
	}
	
}
