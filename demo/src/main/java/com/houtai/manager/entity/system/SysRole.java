package com.houtai.manager.base.entity.system;

import java.util.Date;

import lombok.Data;

/**
 * 系统角色
 * 
 * @author 抓娃小兵
 */
@Data
public class SysRole {

	private Integer roleId;
	private String roleName;
	private String roleDesc;
	private Date createTime;

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

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
}
