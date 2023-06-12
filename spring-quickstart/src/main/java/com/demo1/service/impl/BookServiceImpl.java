package com.demo1.service.impl;

import com.demo1.dao.BookDao;
import com.demo1.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public BookServiceImpl() {
        System.out.println("BookServiceImpl constructor is running...");
    }

    public void save() {
        System.out.println("bool service save...");
        bookDao.save();
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
