package com.mall.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.user.UserShopRlation;
@Mapper
public interface UserShopRlationMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(UserShopRlation record);

    int insertSelective(UserShopRlation record);

    UserShopRlation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserShopRlation record);

    int updateByPrimaryKey(UserShopRlation record);
}