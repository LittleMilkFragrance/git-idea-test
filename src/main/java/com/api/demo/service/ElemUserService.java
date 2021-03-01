package com.api.demo.service;

import com.api.demo.entity.ElecUser;

public interface ElemUserService {
    ElecUser queryUser(String name,String password);
}
