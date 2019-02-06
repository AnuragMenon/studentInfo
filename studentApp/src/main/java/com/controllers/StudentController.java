package com.controllers;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Student;
import com.services.StudentServices;
import com.servicesImpl.StudentServicesImpl;
@Controller 
@RequestMapping(value = "users")
public class StudentController {

	@RequestMapping(value="/page", method = RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("hello");
		return view;
	}
	
	
	@RequestMapping(value="/saveOrUpdate",method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Student users)
	{
		Map<String,Object> map = new HashMap<String,Object>();
		if(userServices.saveOrUpdate(users)) {
			map.put("status","200");
			map.put("message", "Record saved successfully");
		}
		return map;
	}
	
	@RequestMapping(value= "/list",method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(Student users){
		Map<String,Object> map = new HashMap<String, Object>();
		return map;
	}
	
}
