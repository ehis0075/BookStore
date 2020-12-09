package com.example.springmongodb.repository;

import com.example.springmongodb.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Long> {


}
