package com.mall.controller.system;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.mall.controller.BaseController;
import com.mall.model.Page;
import com.mall.model.user.SysRole;
import com.mall.utils.JsonUtil;

/**
 * 
 * <p>Title:BaseDAO实现</p>
 * <p>Description:通用的IBatis BaseDAO实现</p>
 * <p>Copyright:Copyright (c) 2016</p>
 * <p>Company:易泓咨询管理公司 </p>
 * <p>Date:2016年10月18日 下午2:15:41</p>
 * <p>Modify:2016年10月18日 下午2:15:41 </p>
 * <p>Bug:</p>
 * 
 * @author xuliting
 * @version 1.1
 */
@Controller
@RequestMapping("/sysRole")
public class SysRoleController  extends BaseController{
    
    
    @RequestMapping("/findById")
    @ResponseBody
    public String findById(Long id){
        return JsonUtil.toString(super.getSysRoleService().findById(id));
    }

	@RequestMapping("/query")
	public String query(SysRole param,@RequestParam(defaultValue="1") Integer currentPage,@RequestParam(defaultValue="10") Integer pageSize,ModelMap map){
		 PageHelper.startPage(currentPage,pageSize);
		 List<SysRole> list=super.getSysRoleService().query(param);
		 Page page=new Page(list);
		 map.put("roleList", list);
		 map.put("sysRole", param);
		 map.put("page", page);
		 return "/system/role/main";
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String insert(SysRole param){
		return super.getSysRoleService().insert(param).toString();
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(SysRole param){
		return super.getSysRoleService().update(param).toString();
	}
	
	@RequestMapping("/delete")
	@ResponseBody
	public String delete(Long id){
		return super.getSysRoleService().delete(id).toString();
	}
	
}
