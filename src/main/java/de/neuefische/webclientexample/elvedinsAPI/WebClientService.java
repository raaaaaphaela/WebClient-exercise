package de.neuefische.webclientexample.elvedinsAPI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class WebClientService {

    public Message makeApiCall() {
        // GET
        WebClient webClient = WebClient.create("https://eoq2vuf7lltn3qi.m.pipedream.net");

        Animal animal = Objects.requireNonNull(webClient.get()
                        .uri("/6")
                        .retrieve()
                        .toEntity(Animal.class)
                        .block())
                .getBody();


        // POST
        WebClient postWebClient = WebClient.create("https://eokz7vcsigzeiih.m.pipedream.net");

        assert animal != null;
        Message res = Objects.requireNonNull(postWebClient.post()
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .bodyValue(new Message("Ich mag diese Antwort: " + animal.getDescription()))
                        .retrieve()
                        .toEntity(Message.class)
                        .block())
                .getBody();

        return res;

    }
}
