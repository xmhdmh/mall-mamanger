package com.mall.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.user.UserInfo;

@Mapper
public interface UserInfoMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}