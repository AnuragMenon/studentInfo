package com.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import com.entities.Admin;
import com.entities.Student;
import com.services.AdminServices;
import com.services.StudentServices;

@Controller
@RequestMapping(value = "/AdminLogin")
public class AdminController {

	
	@Autowired
	StudentServices userServices;

	@Autowired
	AdminServices adminServices;
	
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("/AdminLogin");
		return view;
	}
	
//	@RequestMapping(value = "/page1", method = RequestMethod.GET)
//	public ModelAndView getPage1() {
//		ModelAndView view1 = new ModelAndView("AdminPage");
//		return view1;
//	}
	
	/*
	 @RequestMapping(value = "/redirect", method = RequestMethod.GET)
	   public String redirect() {
	      return "redirect:AdminPage";
	   }
	   
	 
	 @RequestMapping(value = "/AdminPage", method = RequestMethod.GET)
	   public String finalPage() {
	      return "admin";
	   }
	 
	 */
	 
	 @RequestMapping(value = "/validateAdmin", method = RequestMethod.POST)
	    public ModelAndView validateadmin(@RequestBody Admin admin) {
	        String msg = "";
	        System.out.println(admin.getUserName());
	        System.out.println(admin.getAdminpassword());
	        
	        boolean isValid = false;
	        isValid = adminServices.adminUser(admin.getUserName(), admin.getAdminpassword());
	        if(isValid) {
	        	ModelAndView view1 = new ModelAndView("AdminPage");
	    		return view1;
	        	
	          //  msg = "Welcome " + admin.getUserName() + "!";
	        } else {
	        	
	        	ModelAndView view = new ModelAndView("/AdminLogin");
	    		return view;
	            //msg = "Invalid credentials";
	        }
	        
	        //System.out.println(msg);
	    }
	
	
	
	//List<Student> list = userServices.list();
	 //-------------------Retrieve All Users--------------------------------------------------------
   /* 
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity<List<Student>> listAllUsers() {
        List<Student> users = userServices.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Student>>(users, HttpStatus.OK);
        
    }
 
 */
    @RequestMapping(value= "/getalluser",produces = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.GET)
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
    
  //  @RequestMapping(value = "/getalluser", method = RequestMethod.GET)
	//public List<Student> getResource(){
	//		return list;
//	}
    
    
    //-------------------Retrieve Single User--------------------------------------------------------
  /*     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Student> getUser(@PathVariable("id") long id) {
        System.out.println("Fetching User with id " + id);
        Student user = userServices.findById(id);
        if (user == null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Student>(user, HttpStatus.OK);
    }
 
     
     
    //-------------------Create a User--------------------------------------------------------
    
   /* @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity<Void> createUser(@RequestBody Student user,    UriComponentsBuilder ucBuilder) {
        System.out.println("Creating User " + user.getStudentName());
 
        if (userServices.isUserExist(user)) {
            System.out.println("A User with name " + user.getStudentName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        userServices.saveUser(user);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getStudentid()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
     */
    
    @RequestMapping(value = "/postuser" ,method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getSaved( @RequestBody Student student) {

    	
		Map<String, Object> map = new HashMap<String, Object>();
		if (userServices.saveOrUpdate(student)) {
			map.put("status", "200");
			map.put("message", "Record saved successfully");
		}
		return map;
	}
   
   
    //------------------- Update a User --------------------------------------------------------
   /*  
    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Student> updateUser(@PathVariable("id") long id, @RequestBody Student user) {
        System.out.println("Updating User " + id);
         
        Student currentUser = userServices.findById(id);
         
        if (currentUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
 
        currentUser.setStudentName(user.getStudentName());
        currentUser.setBranch(user.getBranch());
         
        userServices.updateUser(currentUser);
        return new ResponseEntity<Student>(currentUser, HttpStatus.OK);
    }
 
    
    
    //------------------- Delete a User --------------------------------------------------------
     
    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Student> deleteUser(@PathVariable("id") long id) {
        System.out.println("Fetching & Deleting User with id " + id);
 
        Student user = userServices.findById(id);
        if (user == null) {
            System.out.println("Unable to delete. User with id " + id + " not found");
            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
        }
 
        userServices.deleteUserById(id);
        return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
    }
 
     
    
    //------------------- Delete All Users --------------------------------------------------------
     
    @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    public ResponseEntity<Student> deleteAllUsers() {
        System.out.println("Deleting All Users");
 
        userServices.deleteAllUsers();
        return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
    }
	
	
	/*public List<StudentServices> studentDetailsList = new ArrayList<StudentServices>();
	
	//List<Student> list = userServices.list();
	
	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("users");
		return view;
	}

	@RequestMapping(value="/userdetails",method=RequestMethod.GET,produces="application/json")
    public List<StudentServices> GetUserdetails()
    {
        return studentDetailsList;
    }
	
	
	@RequestMapping(value="/user",consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public List<StudentServices> ProcessUser(@RequestBody StudentServices userServices)
    {
        
            studentDetailsList.add(userServices);
        
        return studentDetailsList;
    }
	
	@RequestMapping(value = "/saveOrUpdate",consumes = MediaType.APPLICATION_JSON_VALUE ,method = RequestMethod.POST)
	public @ResponseBody Map<String, Object> getSaved(Student users) {

		Map<String, Object> map = new HashMap<String, Object>();
		if (userServices.saveOrUpdate(users)) {
			map.put("status", "200");
			map.put("message", "Record saved successfully");
		}
		return map;
	}

	@RequestMapping(value= "/list",consumes = MediaType.APPLICATION_JSON_VALUE,method = RequestMethod.POST)
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
