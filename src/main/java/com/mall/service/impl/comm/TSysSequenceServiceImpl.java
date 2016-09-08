package com.mall.service.impl.comm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mall.dao.comm.TSysSequnecesMapper;
import com.mall.model.comm.TSysSequneces;
import com.mall.service.comm.ITSysSequenceService;

@Service
public class TSysSequenceServiceImpl implements ITSysSequenceService{
	@Autowired
	TSysSequnecesMapper mapper;

	@Override
	public Integer querySequenceNo(Integer seqCode) {
		Integer seqNo=mapper.querySeqNo(seqCode);
		TSysSequneces param=new TSysSequneces();
		param.setSeqCode(seqCode);
		param.setSeqNo(seqNo);
		mapper.update(param);
		return seqNo;
	}

}
