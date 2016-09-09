package com.mall.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.user.SysPermission;

@Mapper
public interface SysPermissionMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}