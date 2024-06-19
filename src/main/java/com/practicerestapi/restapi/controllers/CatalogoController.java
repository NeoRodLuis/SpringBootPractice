/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practicerestapi.restapi.controllers;

import com.practicerestapi.restapi.models.Item;
import com.practicerestapi.restapi.repositories.ItemRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author rodriguez.luis
 */
@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {
    
    @Autowired
    private ItemRepository itemRepository;

    @GetMapping
    public List<Item> getCatalogo(@RequestParam(required = false) String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return itemRepository.findAll();
        } else {
            return itemRepository.findByNombreContaining(nombre);
        }
    }
}
