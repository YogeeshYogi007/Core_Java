package com.cg.shopping.entities;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="shopowner")
public class ShopOwner {
	 
	private int id;
	private String name;
	private String address;
	private LocalDate dob;
	private String shop;
	
}
