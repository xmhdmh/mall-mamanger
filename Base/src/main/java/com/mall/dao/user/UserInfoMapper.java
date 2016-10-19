package com.mall.dao.user;
import org.apache.ibatis.annotations.Mapper;
import com.mall.dao.BaseMapper;
import com.mall.model.user.UserInfo;

@Mapper
public interface UserInfoMapper extends BaseMapper{

    /**
     * 
     * @Title: 修改密码
     * @author xuliting
     * @param userName 用户名
     * @param newPwd 新密码
     * @return
     */
    Integer editPwd(UserInfo param);
}