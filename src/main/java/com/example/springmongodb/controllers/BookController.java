package com.example.springmongodb.controllers;

import com.example.springmongodb.models.Book;
import com.example.springmongodb.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){

        bookRepository.save(book);
        return "Added book with id : "+ book.getId();
    }

    @GetMapping("/findAllBooks")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/findBook/{id}")
    public Optional<Book> getBook(@PathVariable Long id){
        return bookRepository.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id){
        bookRepository.deleteById(id);
        return "book deleted with id :  "+ id;
    }
}
