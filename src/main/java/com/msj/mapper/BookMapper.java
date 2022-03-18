package com.msj.mapper;

import com.msj.pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    @Select("select * from book")

    List<Book> selectAll();

    @Select("insert into book values (null,#{bookName},#{bookPrice},#{publishName})")
    void add(Book book);

    @Select("select * from book where bookId=#{bookId} ")
    Book selectById(int bookId);

    @Select("update book set bookName=#{bookName},bookPrice=#{bookPrice},publishName=#{publishName} where bookId=#{bookId}")
    void update(Book book);
    @Select("delete from book where  bookId=#{bookId} ;")
    void delete(Book book);



}
