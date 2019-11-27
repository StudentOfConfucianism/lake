package com.houtai.manager.livable.modules.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houtai.manager.livable.modules.system.mapper.SysRolePermMapper;
import com.houtai.manager.livable.modules.system.service.ISysRolePermService;

@Service
public class SysRolePermServiceImpl implements ISysRolePermService {

	@Autowired
	private SysRolePermMapper sysRolePermMapper;

	@Override
	public String getRolePermByRoleId(Integer roleId) {
		return sysRolePermMapper.getRolePermByRoleId(roleId);
	}

	@Override
	public void insertOrUpdate(Integer roleId, String rolePerm) {
		sysRolePermMapper.insertOrUpdate(roleId, rolePerm);
	}

	@Override
	public void deleteRolePermByRoleId(Integer roleId) {
		sysRolePermMapper.deleteRolePermByRoleId(roleId);
	}

	@Override
	public void deleteRolePermByPermId(Integer permId) {
		sysRolePermMapper.deleteRolePermByPermId(permId);
	}

	@Override
	public void deleteRolePermByPermIds(String permIds) {
		sysRolePermMapper.deleteRolePermByPermIds(permIds);
	}

}
