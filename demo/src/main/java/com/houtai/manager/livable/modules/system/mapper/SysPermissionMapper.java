package com.houtai.manager.livable.modules.system.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.houtai.manager.base.entity.system.SysPermission;
import com.houtai.manager.livable.modules.base.mapper.SqlMapper;
import com.houtai.manager.livable.utils.PageData;

@Mapper
public interface SysPermissionMapper extends SqlMapper{

	@Select("SELECT sp.perm_id as id, sp.perm_pid as parentId, sp.perm_name as name,"
			+ " sp.perm_id as permId, sp.perm_pid as permPid, sp.perm_name as permName,"
			+ " sp.perm_desc as permDesc, sp.perm_url as permUrl, sp.is_show as isShow, "
			+ " sp.create_time as createTime "
			+ "FROM sys_permission sp")
	List<SysPermission> getSysPermissionList();

	@SelectProvider(type = SysPermissionMapperProvider.class, method = "getPermissionBySysUserId")
	List<SysPermission> getPermissionBySysUserId(Integer id);

	@SelectProvider(type = SysPermissionMapperProvider.class, method = "getSysPermissionPageData")
	List<SysPermission> getSysPermissionPageData(@Param("id") Integer id, @Param("pid") Integer pid);

	@SelectProvider(type = SysPermissionMapperProvider.class, method = "insertOrUpdate")
	void insertOrUpdate(PageData pd);

	@Delete("delete from sys_permission where perm_id = #{permId} or perm_pid = #{permId}")
	void delete(Integer permId);

	@SelectProvider(type = SysPermissionMapperProvider.class, method = "deletes")
	void deletes(@Param("ids") String ids);

	@Select("SELECT sp.perm_id permId, spp.perm_id permPid, sp.perm_name permName, "
			+ "  ifnull(spp.perm_name, '根节点')  permPname, sp.perm_desc permDesc ,"
			+ "  sp.perm_url permUrl, sp.sort, sp.is_show isShow "
			+ " FROM sys_permission sp "
			+ " LEFT JOIN sys_permission spp ON sp.perm_pid = spp.perm_id " + " WHERE " + "	 sp.perm_id =  #{permId}")
	PageData get(Integer permId);

	@Select("select perm_id as permId, perm_name as permName from sys_permission where perm_pid is null order by sort")
	List<PageData> getAvailable();

}
