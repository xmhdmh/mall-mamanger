package com.mall.controller.ads;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.mall.dao.user.UserInfoMapper;
import com.mall.model.ads.TAdsCategory;
import com.mall.model.user.UserInfo;
import com.mall.service.ads.ITAdsCategoryService;

@RestController
@RequestMapping("/tAdsCategory")
public class TAdsCategoryController {

	@Autowired
	private ITAdsCategoryService categoryService;
	
	@RequestMapping("/query")
	public PageInfo<TAdsCategory> query(){
		List<TAdsCategory> list=categoryService.query(null);
		//map.put("list", list);
		return new PageInfo<TAdsCategory>(list);
	}
	
	@RequestMapping("/insert")
	public Integer insert(TAdsCategory param){
		return categoryService.insert(param);
	}
	
	@RequestMapping("/deleteIds")
	public Integer delete(@RequestParam List<Integer> ids){
		return categoryService.deleteIds(ids);
	}
	
	@RequestMapping("/update")
	public Integer update(TAdsCategory param){
		return categoryService.update(param);
	}
	
	@RequestMapping("/delete")
	public Integer delete(@RequestParam Integer id){
		return categoryService.delete(id);
	}
	
}
