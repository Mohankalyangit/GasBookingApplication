package com.gasbooking.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Customer  {

	// data members
	@Id
	@GeneratedValue
	private int customerId;

	private int accountNo;

	private String ifscNo;

	private String pan;

	private Cylinder cylinder;

	private Bank bank;

	// constructors
	public Customer() {
		super();
	}

	public Customer(int customerId,int accountNo, String ifscNo, String pan,Cylinder cylinder, Bank bank) {
		super();
		this.customerId = customerId;
		this.accountNo = accountNo;
		this.ifscNo = ifscNo;
		this.pan = pan;
		this.cylinder = cylinder;
		this.bank = bank;
	}

	// getters and setters
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public Cylinder getCylinder() {
		return cylinder;
	}

	public void setCylinder(Cylinder cylinder) {
		this.cylinder = cylinder;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getIfscNo() {
		return ifscNo;
	}

	public void setIfscNo(String ifscNo) {
		this.ifscNo = ifscNo;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cylinder=" + cylinder + ", bank=" + bank + ", accountNo="
				+ accountNo + ", ifscNo=" + ifscNo + ", pan=" + pan + "]";
	}

}