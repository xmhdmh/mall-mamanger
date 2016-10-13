package com.mall.service.system;

import java.util.List;

import com.mall.model.system.SysLog;
import com.mall.model.user.UserInfo;

public interface SysLogService {

	public void insert(SysLog param,UserInfo user);
	
	public List<SysLog> query(SysLog param);
}
