package com.mall.service.impl.ads;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.dao.ads.TAdsCategoryMapper;
import com.mall.model.ads.TAdsCategory;
import com.mall.service.ads.ITAdsCategoryService;
import com.mall.service.comm.ITSysSequenceService;
import com.mall.service.impl.comm.BaseServiceImpl;
import com.mall.utils.SeqConstants;

@Service
public class TAdsCategoryServiceImpl extends BaseServiceImpl implements ITAdsCategoryService{


	
	@Override
	public List<TAdsCategory> query(TAdsCategory param){
		return (List<TAdsCategory>) super.gettAdsCategoryMapper().query(param);
	}
	
	@Override
	public Integer delete(Integer id){
		return super.gettAdsCategoryMapper().delete(id);
	}
	
	@Override
	public Integer insert(TAdsCategory param){
		Integer count=super.gettAdsCategoryMapper().queryIsExistTAdsCategory(param.getSortName());
		if(count>0){
			return -1;//改广告类型名称已经存在
		}else{
			param.setCreatedTime(new Date());
			//param.setId(iNo.querySequenceNo(SeqConstants.SEQ_T_ADS_CATEGORY));
			return super.gettAdsCategoryMapper().insert(param);
		}
	}
	
	@Override
	public Integer update(TAdsCategory param){
		param.setUpdatedTime(new Date());
		return super.gettAdsCategoryMapper().update(param);
	}

	@Override
	public Integer deleteIds(List<Integer> ids) {
		return super.gettAdsCategoryMapper().deleteByIds(ids);
	}
	
}
