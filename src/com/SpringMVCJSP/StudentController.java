package com.SpringMVCJSP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@ComponentScan
public class StudentController {
	@GetMapping(value="/")
	public void test() {
		System.out.println("Welcome to MVC");
	}
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public ModelAndView student() {
		return new ModelAndView("student","command",new Student());
	}
	
//	@RequestMapping(value="/addStudent", method=RequestMethod.POST)
//	public String addStudent(@ModelAttribute("SpringWeb") Student student, ModelMap model) {
//		model.addAttribute("age", student.getAge());
//		model.addAttribute("name", student.getName());
//		model.addAttribute("id", student.getId());
//		return "result";
//	}
	 @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
     public String addStudent(@ModelAttribute("SpringWeb")Student student, 
  
  ModelMap model) {
     model.addAttribute("name", student.getName());
     model.addAttribute("age", student.getAge());
     model.addAttribute("id", student.getId());
     
     return "result";
  }
	@RequestMapping("/add")
	public ModelAndView add() {
		System.out.println("I am here");
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
}
