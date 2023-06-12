package com.demo1.dao;

import com.demo1.dao.impl.BookDaoImpl;

public class BookDaoFactory {
    //静态
    public static BookDao getBookDao() {
        System.out.println(" static factory setup...");
        return new BookDaoImpl();
    }
    //非静态
    public BookDao getBookDao1(){
        System.out.println("factory setup...");
        return new BookDaoImpl();
    }

}
