package com.sathya.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Roles;
import com.sathya.security.service.IRolesService;

@RestController
@RequestMapping(path = "/roles")
public class RolesController {

	@Autowired
	private IRolesService service;
	
	
	@PostMapping(path = "/insertroles")
	public Roles insertRolesData(@RequestBody Roles roles) {
		
		return service.insertRolesData(roles);
	}
	
	
	@GetMapping(path = "/getAllRoles")
	public Iterable<Roles> getAllRolesData(){
		
		return service.getAllRolesData();
	}
	
	
	
	@PutMapping(path = "/upadateRoles")
	public Roles updateRolesData(@RequestBody Roles roles ) {
		
		return service.updataRoles(roles);
	}
	

	
	@DeleteMapping(path = "/deleteById")
	public void deleteRoles(@RequestParam Integer id) {
		
		service.deleteByID(id);
	}
	
}
