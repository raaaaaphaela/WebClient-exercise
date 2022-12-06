package de.neuefische.webclientexample.rickAndMorty.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterInfo {

    private int count;
    private int pages;
    private String next;
    private String prev;

}
