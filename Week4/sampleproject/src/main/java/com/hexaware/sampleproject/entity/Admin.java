package com.hexaware.sampleproject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;








@Entity								//takes class as table
@Table(name="admin_info")			//takes table name as admin_info
public class Admin {
	
	@Id
	@SequenceGenerator(name="admin_seq", initialValue = 100, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "admin_seq")
	private int adminId;															//referred as primary key
	
	private String userName;
	private String password;
	private String role;
	
	
	
	public Admin() {
		super();
	}



	public Admin(int adminId, String userName, String password, String role) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.role = role;
	}



	public int getAdminId() {
		return adminId;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
	
	
	
	
	
	

}
