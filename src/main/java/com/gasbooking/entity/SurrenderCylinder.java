package com.gasbooking.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity

public class SurrenderCylinder {
	
	@Id
	@GeneratedValue

	private int surrenderId;
	private LocalDate surrenderDate;
	private Customer customer;
	private Cylinder cylinder;
	
	public SurrenderCylinder() {
		super();
	}
	
	public SurrenderCylinder(int surrenderId, LocalDate surrenderDate, Customer customer, Cylinder cylinder) {
		super();
		this.surrenderId = surrenderId;
		this.surrenderDate = surrenderDate;
		this.customer = customer;
		this.cylinder = cylinder;
	}

	public int getSurrenderId() {
		return surrenderId;
	}

	public void setSurrenderId(int surrenderId) {
		this.surrenderId = surrenderId;
	}

	public LocalDate getSurrenderDate() {
		return surrenderDate;
	}

	public void setSurrenderDate(LocalDate surrenderDate) {
		this.surrenderDate = surrenderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	@Override
	public String toString() {
		return "SurrenderCylinder [surrenderId=" + surrenderId + ", surrenderDate=" + surrenderDate + ", customer="
				+ customer + ", cylinder=" + cylinder + "]";
	}

}
