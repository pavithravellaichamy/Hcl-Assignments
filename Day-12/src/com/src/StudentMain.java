/**
 * 
 */
package com.src;
/**
 * @author PAVINANDY
 *
 */
import java.util.ArrayList;
import java.util.Base64;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) 
	{
		Base64.Encoder encode=Base64.getEncoder();  //for encoding
		ArrayList<StudentEncrypt> al=new ArrayList<>();  //creating the ArrayList
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int num=sc.nextInt();  //number of students
		String name;
		String id;
		String grade;
		String address;
		for(int i=0;i<num;i++) //loop for getting n number of student details
		{
			System.out.println("Enter the name : ");
			name=sc.next();
			name = encode.encodeToString(name.getBytes());
			System.out.println("Enter the id : ");
			 id=sc.next();
			id = encode.encodeToString(id.getBytes());
			System.out.println("Enter the grade : ");
			grade=sc.next();
			grade = encode.encodeToString(grade.getBytes());
			System.out.println("Enter the address : ");
			address=sc.next();
			address = encode.encodeToString(address.getBytes());
			System.out.println(name+id+grade+address);
			StudentEncrypt se=new StudentEncrypt(name,id,grade,address);  //encrypting the details
			al.add(se);  //adding to the ArrayList
		}
		System.out.println(al);  //printing the values
	}

}
