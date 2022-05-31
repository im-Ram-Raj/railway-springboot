package com.ram.railway.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "railway_db")
public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "Name is required!")
	private String name;
	
	@NotEmpty(message = "Email is required!")
	private String email;
	
	@NotEmpty(message = "Phone number is required!")
	private String phone;
	
	@NotEmpty(message = "Start Location is required!")
	private String startLocation;
	
	@NotEmpty(message = "End Location is required!")
	private String endLocation;
	
	@NotEmpty(message = "Date is required!")
	private String date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Railway(int id, @NotEmpty(message = "Name is required!") String name,
			@NotEmpty(message = "Email is required!") String email,
			@NotEmpty(message = "Phone number is required!") String phone,
			@NotEmpty(message = "Start Location is required!") String startLocation,
			@NotEmpty(message = "End Location is required!") String endLocation,
			@NotEmpty(message = "Date is required!") String date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.startLocation = startLocation;
		this.endLocation = endLocation;
		this.date = date;
	}

	public Railway() {
		super();
	}
		
}
