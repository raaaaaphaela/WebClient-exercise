package de.neuefische.webclientexample.rickAndMorty.service;

import de.neuefische.webclientexample.rickAndMorty.model.CharacterResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class RickAndMortyWebClient {

    public List<CharacterResponse> getAllCharacters() {

        WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");

        Flux<CharacterResponse> response = Objects.requireNonNull(webClient.get()
                .retrieve()
                .bodyToFlux(CharacterResponse.class));

        return response.collect(Collectors.toList()).share().block();
    }

    public List<CharacterResponse> getAllAliveCharacters() {

        WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/character");

        Flux<CharacterResponse> response = Objects.requireNonNull(webClient.get()
                        .uri("/?status=alive")
                .retrieve()
                .bodyToFlux(CharacterResponse.class));

        return response.collect(Collectors.toList()).share().block();
    }
}
