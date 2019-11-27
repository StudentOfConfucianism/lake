package com.houtai.manager.livable.modules.system.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.houtai.manager.livable.utils.PageData;

public interface ISysRoleService {

	JSONObject getSysRolePageData(Integer page, Integer limit, String name);

	void insertOrUpdate(PageData pd);

	void delete(Integer id);

	PageData get(Integer permId);

	List<PageData> getAll();

}
