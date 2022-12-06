package de.neuefische.webclientexample.rickAndMorty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterOrigin {
    private String name;
    private String url;
}
