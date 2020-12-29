package com.sathya.security.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Roles    {



	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "roleid",unique = true)
	private  Integer roleId;
	
	
	private String roleName;
	
	private String roleDescripation;

	@OneToMany(mappedBy = "roles")
	private  Set<Perimission> perimissions;
	
	
	
	public Roles() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleDescripation == null) ? 0 : roleDescripation.hashCode());
		result = prime * result + ((roleId == null) ? 0 : roleId.hashCode());
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Roles other = (Roles) obj;
		if (roleDescripation == null) {
			if (other.roleDescripation != null)
				return false;
		} else if (!roleDescripation.equals(other.roleDescripation))
			return false;
		if (roleId == null) {
			if (other.roleId != null)
				return false;
		} else if (!roleId.equals(other.roleId))
			return false;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		return true;
	}


	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescripation;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescripation = roleDescription;
	}

	@Override
	public String toString() {
		return "Roles [roleId=" + roleId + ", roleName=" + roleName + ", roleDescription=" + roleDescripation + "]";
	}
	
	
}
