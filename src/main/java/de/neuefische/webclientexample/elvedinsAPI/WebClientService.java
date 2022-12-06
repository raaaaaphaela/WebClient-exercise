package de.neuefische.webclientexample.elvedinsAPI;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class WebClientService {

    public HttpStatusCode makeApiCall() {
        // GET
        WebClient webClient = WebClient.create("https://eoq2vuf7lltn3qi.m.pipedream.net");

        Animal animal = Objects.requireNonNull(webClient.get()
                        .uri("/6")
                        .retrieve()
                        .toEntity(Animal.class)
                        .block())
                .getBody();


        // POST
        WebClient webClient2 = WebClient.create("https://eokz7vcsigzeiih.m.pipedream.net");

        assert animal != null;
        HttpStatusCode res = Objects.requireNonNull(webClient2.post()
                        .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                        .bodyValue("Ich mag diese Antwort " + animal.getDescription())
                        .retrieve()
                        .toBodilessEntity()
                        .block())
                .getStatusCode();

        return res;

    }
}
