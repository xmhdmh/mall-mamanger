package com.mall.dao;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
/**
 * BaseMapper 抽象基础接口
 * @author xuliting
 *
 */
@Mapper
public abstract interface BaseMapper {
	
	 public abstract <T> List<T> query(T param);

	  public abstract <T> Integer update(T param);

	  public abstract <T> Integer delete(Integer id);

	  public abstract <T> Integer insert(T param);

	  public abstract <T> T findById(Integer id);

	  public abstract <T> T findByName(String name);
}
