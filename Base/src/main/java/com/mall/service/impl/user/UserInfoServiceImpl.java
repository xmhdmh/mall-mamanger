package com.mall.service.impl.user;

import org.springframework.stereotype.Service;

import com.mall.model.user.UserInfo;
import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.user.UserInfoService;

/**
 * @ClassName: UserInfoServiceImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author 庄友权
 * @date 2016年9月9日 下午1:16:29
 * 
 */
@Service
public class UserInfoServiceImpl extends BaseServiceImpl implements UserInfoService{
    /* (非 Javadoc) 
    * <p>Title: findByName</p> 
    * <p>Description: </p> 
    * @param userName
    * @return 
    * @see com.mall.service.user.UserInfoService#findByName(java.lang.String) 
    */ 
    
    
    @Override
    public UserInfo findByName(String userName) {
        // TODO Auto-generated method stub
        return super.getUserInfoMapper().findByName(userName);
    }

}
