package com.mall.service.ads;
import java.util.List;
import com.mall.model.ads.TAdsCategory;

public interface ITAdsCategoryService{
	
	public List<TAdsCategory> query(TAdsCategory param);
	
	public Integer delete(Integer id);
	
	public Integer insert(TAdsCategory param);
	
	public Integer update(TAdsCategory param);
	
	public Integer deleteIds(List<Integer> ids);
}
