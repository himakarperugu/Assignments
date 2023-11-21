package com.hexaware.restapi.dto;

import jakarta.validation.constraints.Pattern;

public class CustomerDTO {
	
	
	
	
	private long cid;
	@Pattern(regexp="[A-Z]")
	private String cname;
	@Pattern(regexp="[$@#]")
	private String email;
	
	
	public CustomerDTO() {
		super();
	}


	public long getCid() {
		return cid;
	}


	public void setCid(long cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

}
