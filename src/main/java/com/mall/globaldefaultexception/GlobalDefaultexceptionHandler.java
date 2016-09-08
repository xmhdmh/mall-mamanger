/**   
* @Title: GlobalDefaultexceptionHandler.java
* @Package com.mall.globaldefaultexception
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月8日 下午2:27:29
* @version V1.0   
*/


package com.mall.globaldefaultexception;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ClassName: GlobalDefaultexceptionHandler
 * @Description: TODO(全局异常)
 * @author 庄友权
 * @date 2016年9月8日 下午2:27:29
 * 
 */
@ControllerAdvice
public class GlobalDefaultexceptionHandler {
    private Logger logger =  LoggerFactory.getLogger(this.getClass());
    @ExceptionHandler(value=Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception e){
      //System.out.println("全局异常:"+e.getMessage());
      ModelAndView mav = new ModelAndView();
      logger.error(e.toString());
      logger.error(req.getRequestURL().toString());
      mav.setViewName("404");
      return mav;
    }
}
