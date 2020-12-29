package com.sathya.security.data;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.sathya.security.entities.Roles;

public interface RolesReporitory extends CrudRepository<Roles, Integer> {

	
	public Optional<Roles> findByRoleId(Integer  roleId);
}
