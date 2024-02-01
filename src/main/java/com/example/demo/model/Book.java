package com.example.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * 描述
 *
 * @author FuJing
 * @date 2020/5/26 14:57
 */
@Data
@Configuration
public class Book {

    @Value("${book.name}")
    private String name;
    @Value("${book.author}")
    private String author;
}
