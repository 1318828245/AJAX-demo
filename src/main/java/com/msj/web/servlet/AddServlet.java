package com.msj.web.servlet;

import com.alibaba.fastjson.JSON;
import com.msj.pojo.Book;
import com.msj.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    private  BookService service=new BookService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("application/json;charset=utf-8");
        //request不能接收json数据
          //1.获取请求体数据
        BufferedReader br=request.getReader();
        String params=br.readLine();
        //将json字符串转换成一个java对象
           Book book= JSON.parseObject(params,Book.class);
       //response.setContentType("text/html;charset=utf-8");
         //2.调用service
           service.add(book);
           //3.获取响应标识
           response.getWriter().write("success");
           //request.getRequestDispatcher("/selectAllServlet").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
