package com.msj.service;

import com.msj.mapper.UserMapper;
import com.msj.pojo.User;
import com.msj.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();

    //登录方法
    public User login(String username,String password)
    {
        SqlSession sqlSession=factory.openSession();
        //
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //
        User user=userMapper.select(username,password);
        //
        sqlSession.close();

        return user;
    }
    //登录方法
    public boolean register(User user)
    {
        SqlSession sqlSession=factory.openSession();
        //
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
        //
        User user1 = userMapper.selectByUsername(user.getUsername());
        //
        if (user1==null){
            userMapper.add(user);
            sqlSession.commit();
        }
        sqlSession.close();
        return  user1==null;
    }
}
