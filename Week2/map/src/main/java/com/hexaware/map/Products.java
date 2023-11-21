package com.hexaware.map;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Products {
	@Id
	private int product_id;
	private String product_name;
	/*@ManyToOne
	private Customers custome;*/
	@ManyToMany
	private List<Customers> custome=new ArrayList<Customers>();
	
		
	public List<Customers> getCustome() {
		return custome;
	}
	public void setCustome(List<Customers> custome) {
		this.custome = custome;
	}
	/*public Customers getCustome() {
		return custome;
	}
	public void setCustome(Customers custome) {
		this.custome = custome;
	}*/
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	
	
}