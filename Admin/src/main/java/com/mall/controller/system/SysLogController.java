package com.mall.controller.system;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.github.pagehelper.PageHelper;
import com.mall.model.Page;
import com.mall.model.system.SysLog;
import com.mall.service.system.SysLogService;

/**
 * 
 * <p>Title:系统日志管理</p>
 * <p>Description:系统日志管理控制层</p>
 * <p>Copyright:Copyright (c) 2016</p>
 * <p>Company:易泓咨询管理公司 </p>
 * <p>Date:2016年10月13日 下午1:25:14</p>
 * <p>Modify:2016年10月13日 下午1:25:14 </p>
 * <p>Bug:</p>
 * 
 * @author xuliting
 * @version 1.1
 */
@Controller
@RequestMapping("/system")
public class SysLogController {

	@Autowired
	private SysLogService service;
	
	@RequestMapping("/query")
	public String query(SysLog param,@RequestParam(defaultValue="1") Integer currentPage,@RequestParam(defaultValue="10") Integer pageSize,ModelMap map){
		 PageHelper.startPage(currentPage,pageSize);
		 List<SysLog> list=service.query(param);
		 Page page=new Page(list);
		 map.put("sysList", list);
		 map.put("sysLog", param);
		 map.put("page", page);
		 return "/system/syslogList";
	}
}
