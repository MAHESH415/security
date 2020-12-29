package com.sathya.security.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.RolesReporitory;
import com.sathya.security.entities.Roles;
import com.sathya.security.service.IRolesService;

@Service
public class RolesServiceImpl implements IRolesService {

	
	@Autowired
	private RolesReporitory rolesRepository;
	
	

	
	
	@Override
	public Roles insertRolesData(Roles roles) {
		
		return rolesRepository.save(roles);
	}

	
	
	@Override
	public Iterable<Roles> getAllRolesData() {
		
		return rolesRepository.findAll();
	}

	
	
	
	
	@Override
	public Roles updataRoles(Roles roles) {
		
		return rolesRepository.save(roles);
	}

	@Override
	public void deleteByID(Integer id) {

		rolesRepository.deleteById(id);
	}



	@Override
	public Optional<Roles> findByRoleId(Integer  roleId) {
		
		return rolesRepository.findByRoleId(roleId);
	}

}
