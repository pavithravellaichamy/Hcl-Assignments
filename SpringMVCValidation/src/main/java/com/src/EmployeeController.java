package com.src;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController 
{
	@RequestMapping("/reg")  //mapping to the page
	public String registration(Model m)
	{
		Employee e=new Employee();
		m.addAttribute("emp",e);
		return "viewpage";
	}
	@RequestMapping("/register") //mapping to the page
	public String empRegistration(@Valid @ModelAttribute("emp")Employee e,BindingResult br,Model m)
	{
		if(br.hasErrors())
		{
			return "viewpage";	//returning to same page 
		}
		else
		{
			m.addAttribute("employee", e);
			return "display";  //returning to another page 
		}
	}

}
