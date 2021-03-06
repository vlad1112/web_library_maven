package com.weblibrary.dao;

import com.weblibrary.service.BookFull;
import com.weblibrary.entity.Book;

public interface BookDAO {

    long addBook(String title,String author,String year, String type1, String type2,String type3);
    void delete(long isbn);
    Book findBook(String genre);
    BookFull findAll(String title,String author,String year,String genre);
    Book findByIsbn(long isbn);
    Book update(long isbn,String author,String title,String year, String genre1, String genre2, String genre3);
}