package com.example.demo.controller;

import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述
 *
 * @author FuJing
 * @date 2020/5/26 14:44
 */
@RestController
public class HelloController {

    @Autowired
    private Book book;

    @RequestMapping("/hello")
    public String index() {
        return "Hello World000"+book.getName();
    }
}
