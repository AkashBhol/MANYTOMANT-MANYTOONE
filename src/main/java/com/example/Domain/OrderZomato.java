package com.example.Domain;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Data
@Entity
public class OrderZomato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oId;

    private String title;

   @ManyToMany
   private List<Product> products;
   
   @ManyToOne
   @JoinColumn(name="userId")
   private User user;

    
}
