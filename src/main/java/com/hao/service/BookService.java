package com.hao.service;

import com.hao.pojo.Books;

import java.util.List;

/*
@author chenhao
@data 2020/6/3 - 9:17
*/
public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(int id);
    //查询全部书
    List<Books> queryAllBook();
}
