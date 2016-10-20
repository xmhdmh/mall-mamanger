package com.mall.service.impl.user;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.model.Result;
import com.mall.model.user.UserInfo;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.user.UserInfoService;
import com.mall.utils.MD5Util;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:16:29
 * 
 */
@Service
@Transactional
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService{
    
    @Override
    public UserInfo findByName(String userName) {
        return super.getUserInfoMapper().findByName(userName);
    }
    /**
     * 修改密码
     */
	@Override
	public Result editPwd(UserInfo param,String oldPwd,String newPwd) {
	    Result result=new Result("修改成功，请重新登入");
	    if(param.getPassword().equals(MD5Util.shiroPassword(oldPwd, param.getCredentialsSalt()))){
	        param.setPassword(MD5Util.shiroPassword(newPwd, param.getCredentialsSalt()));
	        super.getUserInfoMapper().editPwd(param);
	        result.setUrl("logout.html");
	    }else{
	        result.setResult(false);
	        result.setMessage("原密码输入错误!");
	    }
		return result;
	}

}
