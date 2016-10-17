package com.mall.dao.category;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.category.CategoryRelation;
@Mapper
public interface CategoryRelationMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(CategoryRelation record);

    int insertSelective(CategoryRelation record);

    CategoryRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CategoryRelation record);

    int updateByPrimaryKey(CategoryRelation record);
}