package de.neuefische.webclientexample.rickAndMorty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterResponse {

    private CharacterInfo info;

    private List<Character> results;
}
