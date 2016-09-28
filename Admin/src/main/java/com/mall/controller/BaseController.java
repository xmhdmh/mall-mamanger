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

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

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
    /**
     * 全局默认异常
    * @Title: defaultErrorHandler 
    * @Description: TODO(这里用一句话描述这个方法的作用) 
    * @param @param req
    * @param @param e
    * @param @return    设定文件 
    * @return String    返回类型 
    * @throws
     */
    @ExceptionHandler(value = Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e){
        return "/404";
    }
}
