package com.mall.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.user.SysRolePermission;

@Mapper
public interface SysRolePermissionMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);

    SysRolePermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRolePermission record);

    int updateByPrimaryKey(SysRolePermission record);
}