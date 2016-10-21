package com.mall.dao.user;
import org.apache.ibatis.annotations.Mapper;
import com.mall.dao.BaseMapper;
import com.mall.model.user.UserLogin;

@Mapper
public interface UserLoginMapper extends BaseMapper{

    /**
     * 
     * @Title: 修改密码
     * @author xuliting
     * @param userName 用户名
     * @param newPwd 新密码
     * @return
     */
    Integer editPwd(UserLogin param);
}