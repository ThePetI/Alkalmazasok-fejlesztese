package hu.elte.issuetracker.controllers;

import hu.elte.issuetracker.entities.Guests;
import hu.elte.issuetracker.repositories.GuestsRepository;
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
@RequestMapping("/guests")
public class GuestsController {

    @Autowired
    private GuestsRepository guestsRepository;
    
    @Autowired 
    private AuthenticatedUser authenticatedUser;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Guests>> getAll() {
        return ResponseEntity.ok(guestsRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Guests> get(@PathVariable Integer id) {
        Optional<Guests> guests = guestsRepository.findById(id);
        if (guests.isPresent()) {
            return ResponseEntity.ok(guests.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Guests> post(@RequestBody Guests guests) {
        Guests savedGuests = guestsRepository.save(guests);
        return ResponseEntity.ok(savedGuests);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Guests> put(@RequestBody Guests guests, @PathVariable Integer id) {
        Optional<Guests> oGuests = guestsRepository.findById(id);
        if (oGuests.isPresent()) {
            guests.setId(id);
            return ResponseEntity.ok(guestsRepository.save(guests));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Guests> oGuests = guestsRepository.findById(id);
        if (oGuests.isPresent()) {
            guestsRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
