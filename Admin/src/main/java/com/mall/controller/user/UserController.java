/**   
* @Title: UserController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月13日 下午3:48:04
* @version V1.0   
*/


package com.mall.controller.user;

import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mall.controller.BaseController;
import com.mall.model.user.UserInfo;
import com.mall.utils.JsonUtil;

/**
 * @ClassName: UserController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月13日 下午3:48:04
 * 
 */
@Controller
@RequestMapping("/user")
public class UserController extends BaseController{
    /**
     * 修改用户密码
     * @param oldPwd
     * @param newPwd
     * @return
     */
    @RequestMapping("/editPwd")
    @ResponseBody
    public String editPwd(String oldPwd,String newPwd){
        UserInfo userInfo=(UserInfo) SecurityUtils.getSubject().getSession().getAttribute("userInfo");
        return JsonUtil.toString(super.getUserInfoService().editPwd(userInfo, oldPwd, newPwd));
    }
    
    @RequestMapping("/userList")
    public String userList(){
        return "/userList";
    }
    
    @RequestMapping("/userDetail")
    public String userDetail(){
        return "/userDetail";
    }
}
