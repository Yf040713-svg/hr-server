package com.yf.hr.hrserver.mapper;

import com.yf.hr.hrserver.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id, name, age, gender, phone from user where id = #{id}")
    User findById(Integer id);
}