package com.sathya.security.service;

import com.sathya.security.entities.Perimission;

public interface IPermissionService {

	public Perimission insertPerimissions(Perimission perimission);

	public Iterable<Perimission> getAllPerimissions();

	public Perimission updatePerimissions(Perimission perimission);

	public void deletePermissions(Integer id);

}
