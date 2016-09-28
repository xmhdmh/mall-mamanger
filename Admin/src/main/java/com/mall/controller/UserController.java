/**   
* @Title: UserController.java
* @Package com.mall.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月13日 下午3:48:04
* @version V1.0   
*/


package com.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/userList")
    public String userList(){
        return "/userList";
    }
    
    @RequestMapping("/userDetail")
    public String userDetail(){
        return "/userDetail";
    }
}
