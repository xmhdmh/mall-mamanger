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

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName: GlobalDefaultexceptionHandler
 * @Description: TODO(全局异常)
 * @author 庄友权
 * @date 2016年9月8日 下午2:27:29
 * 
 */

public class GlobalDefaultexceptionHandler {
    @ExceptionHandler(value=Exception.class)
    public String defaultErrorHandler(HttpServletRequest req, Exception e){
        System.out.println(e.getMessage());
        return "404";
    }
}
