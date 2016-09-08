package com.mall.dao.ads;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.mall.dao.BaseMapper;

@Mapper
public interface TAdsCategoryMapper extends BaseMapper{
   
	public Integer queryIsExistTAdsCategory(@Param("sortName")String sortName);
	
	public Integer deleteByIds(@Param("ids") List<Integer> ids);
}