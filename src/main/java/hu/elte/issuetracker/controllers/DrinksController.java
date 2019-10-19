/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.issuetracker.controllers;

import hu.elte.issuetracker.entities.Drinks;
import hu.elte.issuetracker.repositories.DrinksRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Solti
 */
@RestController
@RequestMapping("/drinks")
public class DrinksController {
    @Autowired
    private DrinksRepository drinksRepository;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Drinks>> getAll() {
        return ResponseEntity.ok(drinksRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Drinks> get(@PathVariable Integer id) {
        Optional<Drinks> drinks = drinksRepository.findById(id);
        if (drinks.isPresent()) {
            return ResponseEntity.ok(drinks.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Drinks> post(@RequestBody Drinks drinks) {
        Drinks savedDrinks = drinksRepository.save(drinks);
        return ResponseEntity.ok(savedDrinks);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Drinks> put(@RequestBody Drinks drinks, @PathVariable Integer id) {
        Optional<Drinks> oDrinks = drinksRepository.findById(id);
        if (oDrinks.isPresent()) {
            drinks.setId(id);
            return ResponseEntity.ok(drinksRepository.save(drinks));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Drinks> oDrinks = drinksRepository.findById(id);
        if (oDrinks.isPresent()) {
            drinksRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}