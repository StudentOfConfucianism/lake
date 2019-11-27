package com.houtai.manager.livable.modules.userinfo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.PageHelper;
import com.houtai.manager.livable.utils.LayuiPageUtil;
import com.houtai.manager.livable.modules.userinfo.mapper.UserInfoMapper;
import com.houtai.manager.livable.modules.userinfo.service.IUserInfoService;
import com.houtai.manager.livable.utils.PageData;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

	@Autowired
	private UserInfoMapper userInfoMapper;
	
	@Override
	public JSONObject getTablePageData(Integer page, Integer limit, PageData pd) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, limit);
		String phone = pd.getString("phone");
		String idcard = pd.getString("idcard");
		List<PageData> list = userInfoMapper.getTablePageData(phone, idcard);
		PageInfo<PageData> pageInfo = new PageInfo<>(list);
		JSONObject pageJson = LayuiPageUtil.getLayuiPage(pageInfo);
		return pageJson;
	}

	@Override
	public void insertOrUpdate(PageData pd) {
		// TODO Auto-generated method stub
		userInfoMapper.insertOrUpdate(pd);
	}

	@Override
	public void delete(PageData pd) {
		// TODO Auto-generated method stub
		userInfoMapper.delete(pd);
	}

	@Override
	public PageData get(PageData pd) {
		return userInfoMapper.get(pd);
	}

	@Override
	public List<PageData> getAll(PageData pd) {
		// TODO Auto-generated method stub
		return userInfoMapper.getAll(pd);
	}

	@Override
	public void updateAll(PageData pd) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertBatch(List<PageData> listPd) {
		userInfoMapper.insertBatch(listPd);
	}

}
