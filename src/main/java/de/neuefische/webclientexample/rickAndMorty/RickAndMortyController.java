package de.neuefische.webclientexample.rickAndMorty;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/rick-and-morty")
public class RickAndMortyController {

    private RickAndMortyWebClient webClient;

    @GetMapping()
    public  List<CharacterResponse> getAllCharacter() {
        return webClient.getAllCharacters();
    }

    @GetMapping("/alive")
    public  List<CharacterResponse> getAllAliveCharacter() {
        return webClient.getAllAliveCharacters();
    }
}
