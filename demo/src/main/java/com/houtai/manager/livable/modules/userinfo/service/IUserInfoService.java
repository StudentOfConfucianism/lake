package com.houtai.manager.livable.modules.userinfo.service;

import java.util.List;

import com.houtai.manager.livable.modules.base.service.IBaseService;
import com.houtai.manager.livable.utils.PageData;

public interface IUserInfoService extends IBaseService{

	void insertBatch(List<PageData> listPd);

}
