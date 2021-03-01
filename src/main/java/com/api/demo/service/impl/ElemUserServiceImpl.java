package com.api.demo.service.impl;

import com.api.demo.entity.ElecUser;
import com.api.demo.mapper.ElemUserMapper;
import com.api.demo.service.ElemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("elemUserServiceImpl")
public class ElemUserServiceImpl implements ElemUserService {
    private ElemUserMapper elemUserMapper;
    @Autowired
    public ElemUserServiceImpl(ElemUserMapper elemUserMapper) {
        this.elemUserMapper = elemUserMapper;
    }

    @Override
    public ElecUser queryUser(String name,String password) {
        return elemUserMapper.queryUser(name, password);
    }
}
