package com.sathya.security.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.security.entities.Perimission;
import com.sathya.security.entities.Roles;
import com.sathya.security.service.IPermissionService;
import com.sathya.security.service.IRolesService;

@RestController
@RequestMapping(path = "/perimissions")
public class PerimissionController {

	
	
	
	@Autowired
	private IPermissionService permissionservice;
	
	
	@Autowired
	private IRolesService roleService;
	
	
	@PostMapping(path = "/insertdata")
	public Perimission insertData(Perimission perimission)  {
		
	Optional<Roles> result=roleService.findByRoleId(perimission.getRoleId());
		
	  perimission.setRoles(result.get());
	
		/*
		 * if(result.get()==null) { throw new Exception("invalid state id"); }
		 */
	return permissionservice.insertPerimissions(perimission);
		
	}
	
	
	
	@GetMapping(path = "/getallperimissions")
	public Iterable<Perimission> getAllPerimissions(){
		
		return permissionservice.getAllPerimissions();
	}
	
	
	@PutMapping(path = "/updatePerimissions")
	public Perimission updatePerimissions(Perimission perimission) {
	
	return permissionservice.updatePerimissions(perimission);
	}
	
	
	
	@DeleteMapping(path = "/deleteById")
	public void deletePerimissions(Integer id) {
		
		permissionservice.deletePermissions(id);
	}
	}
