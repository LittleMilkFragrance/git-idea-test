package com.api.demo.mapper;

import com.api.demo.entity.ElecUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface ElemUserMapper {
    @Select("select * from elec_user where logonName=#{name} and logonPwd=#{pwd}")
    ElecUser queryUser(@Param("name") String name,@Param("pwd") String password);
}
