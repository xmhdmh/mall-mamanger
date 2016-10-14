package com.mall.dao.system;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.system.SysDic;
@Mapper
public interface SysDicMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysDic record);

    int insertSelective(SysDic record);

    SysDic selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysDic record);

    int updateByPrimaryKey(SysDic record);
}