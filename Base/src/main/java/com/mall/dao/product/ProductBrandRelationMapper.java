package com.mall.dao.product;

import org.apache.ibatis.annotations.Mapper;

import com.mall.dao.BaseMapper;
import com.mall.model.product.ProductBrandRelation;
@Mapper
public interface ProductBrandRelationMapper extends BaseMapper{
    int deleteByPrimaryKey(Long id);

    int insert(ProductBrandRelation record);

    int insertSelective(ProductBrandRelation record);

    ProductBrandRelation selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ProductBrandRelation record);

    int updateByPrimaryKey(ProductBrandRelation record);
}