package com.example.springmongodb.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Book")
@Data
public class Book {

    @Id
    private Long id;

    private String bookName;

    private String authorName;
}
