package com.hao.dao;

import com.hao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*
@author chenhao
@data 2020/6/3 - 8:50
*/
public interface BookMapper {

    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBook(@Param("bookID") int id);
    //更新一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookById(@Param("bookID") int id);
    //查询全部书
    List<Books> queryAllBook();


}
