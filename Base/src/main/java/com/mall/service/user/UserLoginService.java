/**   
* @Title: UserInfoService.java
* @Package com.mall.service.user
* @Description: TODO(用一句话描述该文件做什么)
* @author 庄友权   
* @date 2016年9月9日 下午1:14:52
* @version V1.0   
*/


package com.mall.service.user;

import com.mall.model.Result;
import com.mall.model.user.UserLogin;
import com.mall.service.BaseService;

/**
 * @ClassName: UserInfoService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:14:52
 * 
 */

public interface UserLoginService extends BaseService<UserLogin>{
    public UserLogin findByName(String userName);
    
    /**
     * 
     * @Title: 修改密码
     * @author xuliting
     * @param param
     * @return
     */
    public Result editPwd(UserLogin param,String oldPwd,String newPwd);
}
