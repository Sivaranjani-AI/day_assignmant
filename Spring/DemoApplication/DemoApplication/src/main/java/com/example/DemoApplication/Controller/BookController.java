package com.example.DemoApplication.Controller;

import com.example.DemoApplication.Entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    // 200 OK
    @GetMapping
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // 201 CREATED
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        books.add(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    // 204 NO CONTENT
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable int id) {

        books.removeIf(book -> book.getBookId().equals(id));

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    // 200 OK / 404 NOT FOUND
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable int id) {

        for (Book book : books) {

            if (book.getBookId().equals(id)) {
                return new ResponseEntity<>(book, HttpStatus.OK);
            }
        }

        throw new BookNotFoundException(
                "Book with ID " + id + " not found"
        );
    }
}