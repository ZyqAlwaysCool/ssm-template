package com.zyq.service;

import com.zyq.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    //增加书
    int addBook(Book book);

    //删除书
    int deleteBookById(int id);

    //修改书信息
    int updateBook(Book book);

    //查询书
    List<Book> queryBooks();
}
