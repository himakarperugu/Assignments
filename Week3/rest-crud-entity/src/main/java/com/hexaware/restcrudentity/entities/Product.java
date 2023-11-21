package com.hexaware.restcrudentity.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Product")
public class Product {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long pid;
		private String pname;
		private  double amount;
		private  LocalDate dom;
		
		
		public Product() {
			super();
		}


		public Long getPid() {
			return pid;
		}


		public void setPid(Long pid) {
			this.pid = pid;
		}


		public String getPname() {
			return pname;
		}


		public void setPname(String pname) {
			this.pname = pname;
		}


		public double getAmount() {
			return amount;
		}


		public void setAmount(double amount) {
			this.amount = amount;
		}


		public LocalDate getDom() {
			return dom;
		}


		public void setDom(LocalDate dom) {
			this.dom = dom;
		}


		@Override
		public String toString() {
			return "Product [pid=" + pid + ", pname=" + pname + ", amount=" + amount + ", dom=" + dom + "]";
		}
		
		
		
		
		
		
		
		}
