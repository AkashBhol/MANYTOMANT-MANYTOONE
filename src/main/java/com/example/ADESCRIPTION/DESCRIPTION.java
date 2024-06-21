package com.example.ADESCRIPTION;

import java.util.List;

import com.example.Domain.OrderZomato;
import com.example.Domain.Product;
import com.example.Domain.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;

public class DESCRIPTION {

	//HAVING THREE CLASS
	//1.USER
	//2.ORDER
	//3.Product
	//ONE USER CAN CREATE n NO OF ORDER
	//SO FIRST WE WILL CREATE USER
	@Data
	@Entity
	public class User {//ONE USER CAN CREATE n NO OF ORDER

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
		
		private String name;
		//SO HERE NO MAPPING
	}
	
	//THEN WE WILL CREATE PRODUCT
	@Data
	@Entity
	public class Product {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    private String name;

	    private String quantity;

	    private String price;
	}
	
	//FINALLY WE WILL CRAETE ORDER
	@Data
	@Entity
	public class OrderZomato {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int oId;

	    private String title;

	    //IN MULTIPLE ORDER WE CAN ADD MULTIPLE PRODUCTS	    
	   @ManyToMany
	   private List<Product> products;
	   
	   @ManyToOne//ONE USER CREATE MULTIPLE ORDER
	   @JoinColumn(name="userId")
	   private User user;

	    
	}
}
