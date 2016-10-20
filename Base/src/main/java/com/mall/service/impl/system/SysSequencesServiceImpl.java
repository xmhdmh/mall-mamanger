package com.mall.service.impl.system;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mall.service.impl.BaseServiceImpl;
import com.mall.service.system.SysSequencesService;

@Service
@Transactional
public class SysSequencesServiceImpl extends BaseServiceImpl implements SysSequencesService{

    @Override
    public Long getSysSequencesId() {
        // TODO Auto-generated method stub
        return null;
    }

}
