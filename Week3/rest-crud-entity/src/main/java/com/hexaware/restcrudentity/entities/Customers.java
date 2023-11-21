package com.hexaware.restcrudentity.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customers")
public class Customers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customer_id;
	private String name;
	private String email;
	private String phone_number;
	private String delivery_address;
	public Customers() {
		super();
	}
	public Customers(int customer_id, String name, String email, String phone_number, String delivery_address) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.delivery_address = delivery_address;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getDelivery_address() {
		return delivery_address;
	}
	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}
	@Override
	public String toString() {
		return "Customers [customer_id=" + customer_id + ", name=" + name + ", email=" + email + ", phone_number="
				+ phone_number + ", delivery_address=" + delivery_address + "]";
	}
	
}
