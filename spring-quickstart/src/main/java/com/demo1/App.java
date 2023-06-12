package com.demo1;

import com.demo1.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContest.xml");

//        BookService bookService = ac.getBean("bookService", BookService.class);
//        bookService.save();

//        BookService bookService1 = ac.getBean("bookService", BookService.class);
//        BookService bookService2 = ac.getBean("bookService", BookService.class);
//        System.out.println(bookService1);
//        System.out.println(bookService2);

        BookDao bookDaoFactory = ac.getBean("bookDaoFactory_static", BookDao.class);
        bookDaoFactory.save();

//        BookDao bookDaoFactory_1 = ac.getBean("bookDaoFactory_1", BookDao.class);
//        bookDaoFactory_1.save();
    }
}
