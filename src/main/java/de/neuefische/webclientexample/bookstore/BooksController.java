package de.neuefische.webclientexample.bookstore;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@AllArgsConstructor
public class BooksController {

    private BooksWebClient client;

    @GetMapping
    private List<Book> getAllBooksFromApi() {
        return client.getAllBooksFromApi();
    }

    @GetMapping(path = "/{id}")
    private Book getOneBookFromApi(@PathVariable String id) {
        return client.getOneBookFromApi(id);
    }
}
