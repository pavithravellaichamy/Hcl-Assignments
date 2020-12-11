package com.src;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@Autowired
	EmployeeDao empdao;
	@RequestMapping("/")
	public String frontpage()
	{
		return "index";
	}
	@RequestMapping("/register")  //mapping to register page
	public String insertion(@RequestParam("emp_ID")String emp_ID, @RequestParam("emp_Name")String emp_Name,
			@RequestParam("emp_Salary")String emp_Salary,Model m)
	{
		Employee e=new Employee();
		e.setEmp_ID(Integer.parseInt(emp_ID));
		e.setEmp_Name(emp_Name);
		e.setEmp_Salary(Integer.parseInt(emp_Salary));
		empdao.saveEmp(e);  //calling the method
		
		List<Employee> l=empdao.getAllEmployee();
		m.addAttribute("li",l);
		return "display";
	}

	@RequestMapping("/delete")
	public String deleteEmp(@RequestParam("emp_ID")String emp_ID, Model m)
	{
		
		Employee e=new Employee();
		e.setEmp_ID(Integer.parseInt(emp_ID));
		
		empdao.deleteEmp(e);  //calling the method
		
		List<Employee> l=empdao.getAllEmployee();
		m.addAttribute("li",l);
		
		return "display";
	}	
	
	@RequestMapping("/update")
	public String updateEmp(@RequestParam("emp_ID")String emp_ID,Model m)
	{
		
		Employee e=new Employee();
		Scanner sc=new Scanner(System.in);
		e.setEmp_ID(Integer.parseInt(emp_ID));
		System.out.println("Enter Employee name : ");
		e.setEmp_Name(sc.next());
		System.out.println("Enter Employee salary : ");
		e.setEmp_Salary(sc.nextInt());
		empdao.updateEmp(e);
		List<Employee> l=empdao.getAllEmployee(); //creation of list
		m.addAttribute("li",l);  //adding to  list
		return "display";
	}	

}
