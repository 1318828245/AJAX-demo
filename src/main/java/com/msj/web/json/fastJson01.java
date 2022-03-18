package com.msj.web.json;

import com.alibaba.fastjson.JSON;

public class fastJson01 {
    public static void main(String[] args) {
        //方法一1.将java对象转换为json对象
        User user=new User();
        user.setId(1);
        user.setUsername("msj");
        user.setPassword("123456");
        String jsonString= JSON.toJSONString(user);
        System.out.println(jsonString);


//方法二2.将json字符串转为java对象
        User u=JSON.parseObject("{\"id\":1,\"password\":\"123456\",\"username\":\"msj\"}",User.class);
        System.out.println(u);


    }
}
