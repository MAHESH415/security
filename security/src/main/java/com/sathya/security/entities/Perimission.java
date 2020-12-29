package com.sathya.security.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

@Entity
public class Perimission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String  perimissionId;
	
	@Transient
	private Integer roleId;
	
	private String perimissionName;
	
	
	private String  perimissionDescripation;
	
	@ManyToOne
	@JoinColumn(name = "roleid")
	private Roles roles;

	public Perimission() {
		super();
	}

	public String  getPerimissionId() {
		return perimissionId;
	}

	public void setPerimissionId(String  perimissionId) {
		this.perimissionId = perimissionId;
	}

	
	

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getPerimissionName() {
		return perimissionName;
	}

	public void setPerimissionName(String perimissionName) {
		this.perimissionName = perimissionName;
	}

	public String getPerimissionDescripation() {
		return perimissionDescripation;
	}

	public void setPerimissionDescripation(String perimissionDescripation) {
		this.perimissionDescripation = perimissionDescripation;
	}

	public Roles getRoles() {
		return roles;
	}

	public void setRoles(Roles roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Perimission [perimissionId=" + perimissionId + ", roleId=" + roleId + ", perimissionName="
				+ perimissionName + ", perimissionDescripation=" + perimissionDescripation + ", roles=" + roles + "]";
	}
	
}
