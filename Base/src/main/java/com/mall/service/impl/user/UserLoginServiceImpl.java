package com.mall.service.impl.user;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.model.Result;
import com.mall.model.user.UserLogin;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.user.UserLoginService;
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
public class UserLoginServiceImpl extends BaseServiceImpl implements UserLoginService{
    
    @Override
    public UserLogin findByName(String userName) {
        return super.getUserLoginMapper().findByName(userName);
    }
    /**
     * 修改密码
     */
	@Override
	public Result editPwd(UserLogin param,String oldPwd,String newPwd) {
	    Result result=new Result("修改成功，请重新登入");
	    if(param.getPassword().equals(MD5Util.shiroPassword(oldPwd, param.getCredentialsSalt()))){
	        param.setPassword(MD5Util.shiroPassword(newPwd, param.getCredentialsSalt()));
	        super.getUserLoginMapper().editPwd(param);
	        result.setUrl("logout.html");
	    }else{
	        result.setResult(false);
	        result.setMessage("原密码输入错误!");
	    }
		return result;
	}
    @Override
    public List<UserLogin> query(UserLogin param) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Integer update(UserLogin param) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Integer delete(Long id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public Integer insert(UserLogin param) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public UserLogin findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

}
