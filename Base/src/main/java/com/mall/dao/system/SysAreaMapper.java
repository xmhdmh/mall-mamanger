package com.mall.dao.system;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.system.SysArea;
@Mapper
public interface SysAreaMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    SysArea selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}