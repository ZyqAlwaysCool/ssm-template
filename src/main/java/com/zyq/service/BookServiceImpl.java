package com.zyq.service;

import com.zyq.dao.BookMapper;
import com.zyq.pojo.Book;

import java.util.List;

/**
 * service层调dao层
 */
public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public List<Book> queryBooks() {
        return bookMapper.queryBooks();
    }
}
