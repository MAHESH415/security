package com.sathya.security.service;

import java.util.Optional;

import com.sathya.security.entities.Roles;

public interface IRolesService {

	public Roles insertRolesData(Roles roles);
	
	public Iterable<Roles> getAllRolesData() ;
	
	public Roles updataRoles(Roles roles);
	
	public void deleteByID(Integer id);
	
	public Optional<Roles> findByRoleId(Integer roleId);
	
	
	
	
	
	
}
