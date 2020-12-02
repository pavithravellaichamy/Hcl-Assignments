/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
import java.util.HashSet;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class EmployeeMain 
{
  public static void main(String args[])
  {
	HashSet<EmployeeEx> hs = new HashSet<>();  //creating the HashSet
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of employees : ");
	int n=sc.nextInt();  //represents number of employees
	for(int i=0;i<n;i++)  //getting details of n number of employees
	{
		System.out.println("Enter name : ");
		String name=sc.next();
		System.out.println("Enter id: ");
		int id=sc.nextInt();
		System.out.println("Enter salary : ");
		int salary=sc.nextInt();
		System.out.println("Enter exp : ");
		int experience=sc.nextInt();
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		EmployeeEx ex=new EmployeeEx(name,id,salary,experience,age);
		hs.add(ex);  //adding elements into the HashSet
	}//sorting based on experience
	HashSet<EmployeeEx> hs1=(HashSet) hs.stream()
				.sorted((s1,s2)->(Integer)s1.experience > (Integer)s2.experience ? 1:-1)
				.collect(Collectors.toSet());
	System.out.println(hs1);
	//displaying the maximum of salary
	Optional<EmployeeEx> max = hs.stream()  
				.max((s3,s4)->(Integer)s3.salary > (Integer)s4.salary ? 1:-1);
	System.out.println("Employee who has maximum salary : "+max);
	//displaying minimum of salary
	Optional<EmployeeEx> min = hs.stream()
				.min((s5,s6)->(Integer)s5.salary > (Integer)s6.salary ? 1:-1);
	System.out.println("Employee who has minimum salary : "+min);
	//getting experience greater than2 and sorting the values
	HashSet hs2=(HashSet) hs.stream()
					.filter((s)->(Integer)s.experience<2)
					.sorted((s1,s2)->(Integer)s1.experience < (Integer)s2.experience ? 1:-1)
					.collect(Collectors.toSet());
	System.out.println(hs2);
	//displaying the values of employees with more than 5 years of experience 
	int count = (int) hs.stream()
			.filter((s)->(Integer)s.experience > 5)
			.count();
	System.out.println("Employees with more than 5 years of experience : "+count);
	HashSet hs3=(HashSet) hs.stream()
							.filter((s)->(Integer)s.experience>5)
							.map((s)->(Integer)s.salary+50000)
							.collect(Collectors.toSet());
	System.out.println("Salary with Bonus : "+hs3);
	//calculating the salary with bonus based on experience
	HashSet hs4=(HashSet) hs.stream()
			.filter((s)->(Integer)s.experience < 5 && (Integer)s.experience > 2)
			.map((s)->(Integer)s.salary+25000)
			.collect(Collectors.toSet());
	System.out.println("Salary with Bonus : "+hs4);
	HashSet hs5=(HashSet) hs.stream()
			.filter((s)->(Integer)s.experience < 2)
			.map((s)->(Integer)s.salary+10000)
			.collect(Collectors.toSet());
	System.out.println("Salary with Bonus : "+hs5);
	
							
	
	
				
	
  }
  }
