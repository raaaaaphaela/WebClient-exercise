package de.neuefische.webclientexample.rickAndMorty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterLocation {

    private String name;
    private String url;
}
