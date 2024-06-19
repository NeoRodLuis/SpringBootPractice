package com.practicerestapi.restapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {
    @GetMapping("/ditto")
    public String getPokemonInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        return restTemplate.getForObject(url, String.class);
    }
}
