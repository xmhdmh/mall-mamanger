package com.springboot.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.springboot.model.user.User;

@Mapper
public interface UserMapper {



    //@Select("select * from sys_user")
    public List<User> queryUser();

    
}
