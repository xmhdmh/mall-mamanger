package com.mall.service.impl.system;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.List;


import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.model.system.SysLog;
import com.mall.model.system.SysSequences;
import com.mall.model.user.UserInfo;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.system.SysLogService;

@Service
@Transactional
public class SysLogServiceImpl extends BaseServiceImpl implements SysLogService{
	
	@Override
	public void insert(SysLog log,UserInfo user) {
		 InetAddress addr = null;
			try {
				addr = InetAddress.getLocalHost();
			} catch (UnknownHostException e) {
			}
			SysSequences sysSequences=new SysSequences();
			//sysSequences.setName();
			super.getSysSequencesMapper().insert(sysSequences);
			log.setId(sysSequences.getId());
			log.setComputer_name(addr.getHostName());
			log.setIp_address(addr.getHostAddress());
		    log.setOpt_time(new Date());
		    log.setOperator(user.getId());
		    super.getSysLogMapper().insert(log);
	}

	@Override
	public List<SysLog> query(SysLog param) {
		return super.getSysLogMapper().query(param);
	}
	
}
