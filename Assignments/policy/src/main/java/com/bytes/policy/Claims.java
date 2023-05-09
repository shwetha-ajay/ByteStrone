package com.bytes.policy;

import java.time.LocalDate;

public class Claims {
	int claims_id;
	String policy_id;
	LocalDate date;
	String description;
	double amount;
	
	public Claims(int claims_id, String policy_id, LocalDate date, String description, double amount) {
		super();
		this.claims_id = claims_id;
		this.policy_id = policy_id;
		this.date = date;
		this.description = description;
		this.amount = amount;
	}

	public int getClaims_id() {
		return claims_id;
	}


	public void setClaims_id(int claims_id) {
		this.claims_id = claims_id;
	}

	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
	public String getDescription() {
		return description;
	}

	
	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
