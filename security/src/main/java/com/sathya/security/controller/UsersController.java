package com.sathya.security.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Users;
import com.sathya.security.service.IUsersService;

@RestController
@RequestMapping(path = "users")
public class UsersController {

	private static final Logger LOGGER=LogManager.getLogger(UsersController.class);
	
	
	
	
	@Autowired
	private IUsersService service;
	
	
	
	
	@PostMapping(path = "/insertUsers")
	public Users insertUsersData(@RequestBody Users users) {
		
		LOGGER.info("Users insert method execution statrted");
		
		Users result=null;
		
		try
		{
			
		result=	service.insertUsersData(users);
		
		LOGGER.debug("result is {0}"+result);
			
		}catch(Exception e) {
			
			LOGGER.error("error is happened :"+e);
			
		}
		
		LOGGER.info("Users insert method execution completed");
		
		return result;
	}
	
	
	
	
	
	
	@GetMapping(path = "/getUsers")
	public Iterable<Users> getAllUsersData() {
		
		LOGGER.info("users get all users method is executed started");
		
		Iterable<Users> result=null;
		
		try
		{
			
			result=service.getAllUsersData();
			
			LOGGER.debug("result is:"+result);
			
		}catch(Exception e) {
			
			
			LOGGER.error("error is happend"+e);
		}
		
		LOGGER.info("users get all users method is executed complted");
		

	   return result;
	}
	
	
	
	
	
	
	
	
	
	
	@PutMapping(path =  "/updataUsers")
	public Users updateUsersData(@RequestBody Users users) {
		
		LOGGER.info("users update  method is executed started");
		
		
		Users result=null;
		
	 try
		{
		
		result=service.updateUsersData(users);
		
		LOGGER.debug("result is:"+result);
		
		}catch(Exception e) {
			
			LOGGER.error("error is heppened"+e);
			
		}
		
	 LOGGER.info("users update  method is executed completed");
		
		
		
		return result;
		
	}
	
	
	@DeleteMapping(path = "/deleteById")
	public void deleteById(@RequestParam Integer id) {
		
		LOGGER.info("users delete method executed started");
		
		try {
			
			 service.deleteById(id);
			 
			 LOGGER.debug("excuted sucessfully completed");
			 
			 
		}catch(Exception e) {
			
			LOGGER.info("users delete method executed complted");
		}
		
	}
	
	
}
