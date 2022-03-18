package com.msj.web.servlet;

import com.alibaba.fastjson.JSON;
import com.msj.pojo.Book;
import com.msj.service.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/selectAllServlet")
public class SelectAllServlet extends HttpServlet {
    private BookService service=new BookService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           //1.调用service查询
        List<Book> books= service.selectAll();
        //2.将集合转换为json对象 序列化
        String jsonString=JSON.toJSONString(books);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
