package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="userName")
	private String userName;
	
	@Column(name="adminPassword")
	private String adminPassword;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAdminpassword() {
		return adminPassword;
	}
	public void setAdminpassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	

}
