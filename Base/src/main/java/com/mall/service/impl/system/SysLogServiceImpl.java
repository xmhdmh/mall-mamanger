package com.mall.service.impl.system;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import org.springframework.stereotype.Service;
import com.mall.model.system.SysLog;
import com.mall.model.user.UserInfo;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.system.SysLogService;

@Service
public class SysLogServiceImpl extends BaseServiceImpl implements SysLogService{
	
	@Override
	public void insert(SysLog log,UserInfo user) {
		 InetAddress addr = null;
			try {
				addr = InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
			}   
			log.setComputer_name(addr.getHostName());
			log.setIp_address(addr.getHostAddress());
		    log.setOpt_time(new Date());
		    log.setOperator(user.getId());
		    super.getSysLogMapper().insert(log);
	}
	
}
