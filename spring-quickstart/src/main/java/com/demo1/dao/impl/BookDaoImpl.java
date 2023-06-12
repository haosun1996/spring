package com.demo1.dao.impl;

import com.demo1.dao.BookDao;

public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
