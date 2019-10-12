/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.issuetracker.controllers;

import hu.elte.issuetracker.entities.Foods;
import hu.elte.issuetracker.repositories.FoodsRepository;
import hu.elte.issuetracker.security.AuthenticatedUser;
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
@RequestMapping("/foods")
public class FoodsController {

    @Autowired
    private FoodsRepository foodsRepository;
    
    @Autowired 
    private AuthenticatedUser authenticatedUser;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Foods>> getAll() {
        return ResponseEntity.ok(foodsRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Foods> get(@PathVariable Integer id) {
        Optional<Foods> foods = foodsRepository.findById(id);
        if (foods.isPresent()) {
            return ResponseEntity.ok(foods.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Foods> post(@RequestBody Foods foods) {
        Foods savedFoods = foodsRepository.save(foods);
        return ResponseEntity.ok(savedFoods);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Foods> put(@RequestBody Foods foods, @PathVariable Integer id) {
        Optional<Foods> oFoods = foodsRepository.findById(id);
        if (oFoods.isPresent()) {
            foods.setId(id);
            return ResponseEntity.ok(foodsRepository.save(foods));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Foods> oFoods = foodsRepository.findById(id);
        if (oFoods.isPresent()) {
            foodsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
