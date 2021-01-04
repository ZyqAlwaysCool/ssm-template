package com.zyq.dao;

import com.zyq.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加书
    int addBook(Book book);

    //删除书
    int deleteBookById(@Param("bookId") int id);

    //修改书信息
    int updateBook(Book book);

    //查询书
    List<Book> queryBooks();
}
