package com.mall.shiro;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;

/**
 * @ClassName: 清除登入之后的session
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月11日 上午9:46:56
 * 
 */

public class FormFilter extends FormAuthenticationFilter{
    /* (非 Javadoc) 
    * <p>Title: onLoginSuccess</p> 
    * <p>Description: </p> 
    * @param token
    * @param subject
    * @param request
    * @param response
    * @return
    * @throws Exception 
    * @see org.apache.shiro.web.filter.authc.FormAuthenticationFilter#onLoginSuccess(org.apache.shiro.authc.AuthenticationToken, org.apache.shiro.subject.Subject, javax.servlet.ServletRequest, javax.servlet.ServletResponse) 
    */ 
    
    
    @Override
    protected boolean onLoginSuccess(AuthenticationToken token,
            Subject subject, ServletRequest request, ServletResponse response)
            throws Exception {
        // TODO Auto-generated method stub
        WebUtils.getAndClearSavedRequest(request);
        WebUtils.redirectToSavedRequest(request, response, "/index.html");
        return false;
    }
}