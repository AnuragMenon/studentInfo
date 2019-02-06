package com.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Student;
import com.servicesImpl.StudentServicesImpl;

@Controller
@RequestMapping(value = "users")
public class StudentController {

	StudentServicesImpl userServices =new StudentServicesImpl();

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("users");
		return view;
	}

	@RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getSaved(Student users) {

		Map<String, Object> map = new HashMap<String, Object>();
		if (userServices.saveOrUpdate(users)) {
			map.put("status", "200");
			map.put("message", "Record saved successfully");
		}
		return map;
	}

	@RequestMapping(value= "/list",method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll(Student users){
		Map<String,Object> map = new HashMap<String, Object>();
		
		List<Student> list = userServices.list();
		
		if(list != null) {
			map.put("status", "200");
			map.put("message", "Data found");
			map.put("data", list);		
		}
		else {
			map.put("status", "404");
			map.put("message", "Data not found");
		}
		
		return map;
	}

	@RequestMapping(value= "/delete",method = RequestMethod.POST)
	public @ResponseBody Map<String,Object> delete(Student users){
		Map<String,Object> map = new HashMap<String, Object>();
		
		
		if(userServices.delete(users)) {
			map.put("status", "200");
			map.put("message", "Data is deleted");	
		}
		return map;
	}
	/*
	 * @RequestMapping("/studentform") public String showform(Model m) {
	 * m.addAttribute("command", new Student()); return "studentform"; }
	 * 
	 * @RequestMapping(value="/save",method = RequestMethod.POST) public String
	 * save(@ModelAttribute("emp") Student student){ dao.save(student); return
	 * "redirect:/viewstudent";//will redirect to viewemp request mapping }
	 */

}
