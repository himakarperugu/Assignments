package com.hexaware.sampleproject.dto;

public class AdminDTO {
	
	
	
	private int adminId;															
	private String userName;
	private String password;
	private String role;
	
	
	public AdminDTO() {
		super();
	}


	public AdminDTO(int adminId, String userName, String password, String role) {
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
		return "AdminDTO [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", role=" + role
				+ "]";
	}
	
	
	
	
	
	
	

}
