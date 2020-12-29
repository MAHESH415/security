package com.sathya.security.service;

import com.sathya.security.entities.Users;

public interface IUsersService {

	public Users insertUsersData(Users users); 
	
	public Iterable<Users> getAllUsersData();
	
	public Users updateUsersData(Users users);
	
    public void deleteById(Integer id); 
}
