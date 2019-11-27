package com.houtai.manager.livable.modules.userinfo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;

import com.houtai.manager.livable.modules.base.mapper.SqlMapper;
import com.houtai.manager.livable.utils.PageData;


@Mapper
public interface UserInfoMapper extends SqlMapper{

	@SelectProvider(type=UserInfoMapperProvider.class, method="getTablePageData")
	List<PageData> getTablePageData(@Param("phone") String phone, @Param("idcard") String idcard);

	@InsertProvider(type=UserInfoMapperProvider.class, method="insertOrUpdate")
	void insertOrUpdate(PageData pd);

	@DeleteProvider(type=UserInfoMapperProvider.class, method="delete")
	void delete(PageData pd);
	
	@SelectProvider(type=UserInfoMapperProvider.class, method="get")
	PageData get(PageData pd);

	@SelectProvider(type=UserInfoMapperProvider.class, method="getAll")
	List<PageData> getAll(PageData pd);

	@InsertProvider(type=UserInfoMapperProvider.class, method="insertBatch")
	void insertBatch(@Param("listPd")List<PageData> listPd);

}
