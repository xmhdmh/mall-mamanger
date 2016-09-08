package com.mall.dao.comm;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mall.dao.BaseMapper;

@Mapper
public interface TSysSequnecesMapper extends BaseMapper{
	public Integer querySeqNo(@Param("seqCode")Integer seqCode);
	
}