package com.cg.placement.client;

import com.cg.placement.entities.College;
import com.cg.placement.entities.User;
import com.cg.placement.service.CollegeServiceImpl;
import com.cg.placement.service.ICollegeService;
import com.cg.placement.service.IUserService;
import com.cg.placement.service.UserServiceImpl;


public class Client {

	public static void main(String[] args) {
	
		College college = new College();
		User user = new User();
		
		IUserService service = new UserServiceImpl();
		ICollegeService Cservice = new CollegeServiceImpl();
		
		college.setId(1);
		college.setCollegeName("ABCD");
		college.setLocation("Karnataka");
		Cservice.addCollege(college);
		
		user.setId(1);
		user.setName("XYZ");
		user.setType("UG");
		user.setPassword("*****");
		service.addnewUser(user);
		
		college.setCollegeAdmin(user);
		

	}
}