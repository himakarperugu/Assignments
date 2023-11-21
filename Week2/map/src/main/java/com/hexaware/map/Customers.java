package com.hexaware.map;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Customers {
	@Id
	private int customer_id;
	private String customer_name;
	/*@OneToOne
	private Products product;*/
	 /*@OneToMany   (mappedBy = "custome")
	private List<Items> item=new ArrayList<Items>();*/
	
	@ManyToMany(mappedBy = "custome")
	private List<Products> product=new ArrayList<Products>();
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	
	/*public Products getProduct() {
		return product;
	}
	public void setProduct(Products product) {
		this.product = product;
	}*/
	
	public List<Products> getProduct() {
		return product;
	}
	public void setProduct(List<Products> product) {
		this.product= product;
	}
	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", customer_name=" + customer_name + "]";
	}
	
	
}