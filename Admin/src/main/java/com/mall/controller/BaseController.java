/**   
* @Title: BaseController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月28日 下午3:27:40
* @version V1.0   
*/


package com.mall.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mall.service.system.SysLogService;
import com.mall.service.user.SysRoleService;
import com.mall.service.user.UserInfoService;

/**
 * @ClassName: BaseController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月28日 下午3:27:40
 * 
 */
@Controller
@RequestMapping(produces = { "text/html;charset=UTF-8" })
public class BaseController {
    
    @Autowired
    private SysLogService sysLogService;
    @Autowired
    private SysRoleService sysRoleService;
    @Autowired
    private UserInfoService userInfoService;
    
    
    public UserInfoService getUserInfoService() {
        return userInfoService;
    }

    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    public SysLogService getSysLogService() {
        return sysLogService;
    }

    public void setSysLogService(SysLogService sysLogService) {
        this.sysLogService = sysLogService;
    }



    public SysRoleService getSysRoleService() {
		return sysRoleService;
	}

	public void setSysRoleService(SysRoleService sysRoleService) {
		this.sysRoleService = sysRoleService;
	}
}
