package com.hao.service;

import com.hao.dao.BookMapper;
import com.hao.pojo.Books;

import java.util.List;

/*
@author chenhao
@data 2020/6/3 - 9:18
*/
public class BookServiceImpl implements BookService {

    //service调dao层;组成Dao
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBook(int id) {
        return bookMapper.deleteBook(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}