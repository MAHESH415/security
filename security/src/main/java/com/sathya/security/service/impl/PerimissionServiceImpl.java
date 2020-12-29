package com.sathya.security.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.PerimissionRepository;
import com.sathya.security.entities.Perimission;
import com.sathya.security.service.IPermissionService;

@Service
public class PerimissionServiceImpl implements IPermissionService {

	
	@Autowired
	private PerimissionRepository perimissionRepository; 
	

	
	
	@Transactional
	public Perimission insertPerimissions(Perimission perimission) {
		
		return perimissionRepository.save(perimission);
	}

	
	
	
	
	
	
	@Override
	public Iterable<Perimission> getAllPerimissions() {
		
		return perimissionRepository.findAll();
	}

	
	
	
	@Transactional
	public Perimission updatePerimissions(Perimission perimission) {
		
		return perimissionRepository.save(perimission);
	}

	
	
	

	@Transactional
	public void deletePermissions(Integer id) {
		
		perimissionRepository.deleteById(id);
	}

}
