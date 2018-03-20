package com.xianzhi.bean;

import java.util.List;

public class AdminRoleBean {

	private int RoleId;
	private String RoleDesc;
	private String RoleName;
	
	private List<AdminUserBean> users;

	public int getRoleId() {
		return RoleId;
	}

	public void setRoleId(int roleId) {
		RoleId = roleId;
	}

	public String getRoleDesc() {
		return RoleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		RoleDesc = roleDesc;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public List<AdminUserBean> getUsers() {
		return users;
	}

	public void setUsers(List<AdminUserBean> users) {
		this.users = users;
	}

}
