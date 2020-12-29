package com.sathya.security.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.security.data.UsersRepository;
import com.sathya.security.entities.Users;
import com.sathya.security.service.IUsersService;

@Service 
public class UsersServiceImpl implements IUsersService {

	@Autowired
	private UsersRepository usersRepository;
	
	
	@Transactional
	public Users insertUsersData(Users users) {
		return usersRepository.save(users);
	}

	
	@Override
	public Iterable<Users> getAllUsersData() {
		return usersRepository.findAll();
	}

	
	
	
	@Transactional
	public Users updateUsersData(Users users) {
		
		return usersRepository.save(users);
	}

	
	
	
	@Transactional
	public void deleteById(Integer id) {
		
		usersRepository.deleteById(id);
	}
}
