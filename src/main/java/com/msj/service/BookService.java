package com.msj.service;

import com.msj.mapper.BookMapper;
import com.msj.pojo.Book;
import com.msj.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class BookService {
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
     //查询所有功能
    public List<Book> selectAll()
    {
        SqlSession sqlSession=factory.openSession();
        //
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //
       List<Book> books = bookMapper.selectAll();
        //
        sqlSession.close();
        return books;
    }
    //添加数据功能
    public void add(Book book){
        SqlSession sqlSession=factory.openSession();
        //
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //
        bookMapper.add(book);
        //
        sqlSession.commit();
        //
        sqlSession.close();
    }
    //根据id查询
    public Book selectById(int bookId){
        SqlSession sqlSession=factory.openSession();
        //
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //
        Book book =bookMapper.selectById(bookId);
        sqlSession.close();
        return  book;
    }

    //修改数据功能
    public void update(Book book){
        SqlSession sqlSession=factory.openSession();
        //
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //
        bookMapper.update(book);
        //
        sqlSession.commit();
        //
        sqlSession.close();
    }

    //删除数据功能
    public void delete(Book book){
        SqlSession sqlSession=factory.openSession();
        //
        BookMapper bookMapper=sqlSession.getMapper(BookMapper.class);
        //
        bookMapper.delete(book);
        //
        sqlSession.close();
    }

}
