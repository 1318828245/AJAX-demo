package com.msj.mapper;

import com.msj.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

    @Select("select * from student where username=#{username} and password=#{password}")
    User select(@Param("username") String username, @Param("password") String password);

    //根据用户名查询用户对象
    @Select("select * from student where username=#{username}")
    User selectByUsername(String username);
    //添加用户
    @Select("insert into student  values (null,#{username},#{password});")
    void add(User user);
}
