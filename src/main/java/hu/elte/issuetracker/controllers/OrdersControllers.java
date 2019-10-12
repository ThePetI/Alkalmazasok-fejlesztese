package hu.elte.issuetracker.controllers;

import hu.elte.issuetracker.entities.Orders;
import hu.elte.issuetracker.repositories.OrdersRepository;
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
@RequestMapping("/orders")
public class OrdersControllers {

    @Autowired
    private OrdersRepository ordersRepository;
    
    @Autowired 
    private AuthenticatedUser authenticatedUser;
    
    @GetMapping("")
    public ResponseEntity<Iterable<Orders>> getAll() {
        return ResponseEntity.ok(ordersRepository.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Orders> get(@PathVariable Integer id) {
        Optional<Orders> orders = ordersRepository.findById(id);
        if (orders.isPresent()) {
            return ResponseEntity.ok(orders.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("")
    public ResponseEntity<Orders> post(@RequestBody Orders orders) {
        Orders savedOrders = ordersRepository.save(orders);
        return ResponseEntity.ok(savedOrders);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Orders> put(@RequestBody Orders orders, @PathVariable Integer id) {
        Optional<Orders> oOrders = ordersRepository.findById(id);
        if (oOrders.isPresent()) {
            orders.setId(id);
            return ResponseEntity.ok(ordersRepository.save(orders));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        Optional<Orders> oOrders = ordersRepository.findById(id);
        if (oOrders.isPresent()) {
            ordersRepository.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
