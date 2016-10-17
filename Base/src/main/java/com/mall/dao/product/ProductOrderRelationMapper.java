package com.mall.dao.product;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.product.ProductOrderRelation;
@Mapper
public interface ProductOrderRelationMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(ProductOrderRelation record);

    int insertSelective(ProductOrderRelation record);

    ProductOrderRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductOrderRelation record);

    int updateByPrimaryKey(ProductOrderRelation record);
}