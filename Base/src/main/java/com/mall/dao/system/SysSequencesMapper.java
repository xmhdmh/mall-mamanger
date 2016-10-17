package com.mall.dao.system;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.system.SysSequences;
@Mapper
public interface SysSequencesMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(SysSequences record);

    int insertSelective(SysSequences record);

    SysSequences selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysSequences record);

    int updateByPrimaryKey(SysSequences record);
}