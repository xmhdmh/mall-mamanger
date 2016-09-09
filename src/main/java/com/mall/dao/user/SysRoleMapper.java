package com.mall.dao.user;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.user.SysRole;

@Mapper
public interface SysRoleMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}