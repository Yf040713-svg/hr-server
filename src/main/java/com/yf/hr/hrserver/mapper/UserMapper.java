package com.yf.hr.hrserver.mapper;

import com.yf.hr.hrserver.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("""
    INSERT INTO `user` (name, age, gender, phone)
    VALUES (#{name}, #{age}, #{gender}, #{phone})
""")
    void insert(User user);
}