package com.mall.service.system;


import com.mall.model.system.SysLog;
import com.mall.model.user.UserLogin;
import com.mall.service.BaseService;

public interface SysLogService extends BaseService<SysLog>{

	public void insert(SysLog param,UserLogin user);
	
}
