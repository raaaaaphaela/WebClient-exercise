package de.neuefische.webclientexample.elvedinsAPI;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/get")
public class APIController {

    private WebClientService service;

    @GetMapping()
    public String makeApiCall() {
        return service.makeApiCall().getMessage();
    }
}
