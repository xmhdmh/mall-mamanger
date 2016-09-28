package com.mall.dao.system;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.system.SysLog;

@Mapper
public interface SysLogMapper extends BaseMapper{
    int insert(SysLog record);
}