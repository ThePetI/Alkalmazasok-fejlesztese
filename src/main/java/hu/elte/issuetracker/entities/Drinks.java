/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.issuetracker.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

/**
 *
 * @author Solti
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Drinks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull
    private String title;

    @Column
    private String description;

    @Column
    @NotNull
    private String category;
    
    @Column
    @NotNull
    private Integer price;
    
    @Column
    @NotNull
    private Integer size_of_drink;
        
    @Column
    private Integer alcohol;
        
    @Column
    @NotNull
    private boolean is_available;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDateTime created_at;

    @Column
    @UpdateTimestamp
    private LocalDateTime updated_at;
    
}
insert into Drinks (title, description, category, price, size_of_drink, alcohol, is_available, created_at, updated_at) values ('Staropramen', null, 'Sör', 690, 5, 5,  true, CURRENT_TIMESTAMP(),  CURRENT_TIMESTAMP());