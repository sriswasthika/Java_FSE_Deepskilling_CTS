package com.example.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {
    public List<String> getAllBooks() {
        return Arrays.asList("Spring in Action", "Clean Code", "Effective Java");
    }
}
