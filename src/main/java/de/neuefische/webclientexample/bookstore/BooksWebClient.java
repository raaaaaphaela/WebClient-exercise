package de.neuefische.webclientexample.bookstore;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class BooksWebClient {
    public List<Book> getAllBooksFromApi() {
        WebClient webClient = WebClient.create("https://my-json-server.typicode.com/Flooooooooooorian/BookApi");

        Flux<Book> response = Objects.requireNonNull(webClient.get()
                .uri("/books")
                .retrieve()
                .bodyToFlux(Book.class));

        return response.collect(Collectors.toList()).share().block();
    }

    public Book getOneBookFromApi(String id) {
        WebClient webClient = WebClient.create("https://my-json-server.typicode.com/Flooooooooooorian/BookApi");

        Book response = Objects.requireNonNull(webClient.get()
                .uri("/books/" + id)
                .retrieve()
                .toEntity(Book.class)
                .block()
                .getBody());

     return response;
    }
}