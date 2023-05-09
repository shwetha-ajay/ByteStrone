package com.bytes.policy;

import java.time.LocalDate;
import java.util.List;


public class Policy {
	String policy_id;
	String type;
	String status;
	LocalDate startDate;
	LocalDate endDate;
	int customer_id;
	List<Claims>claims;
	
	public Policy(String policy_id, String type, String status, LocalDate startDate, LocalDate endDate, int customer_id,List<Claims>claims) {
		super();
		this.policy_id = policy_id;
		this.type = type;
		this.status = status;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customer_id = customer_id;
		this.claims=claims;
	}



	public List<Claims> getClaims() {
		return claims;
	}


	public void setClaims(List<Claims> claims) {
		this.claims = claims;
	}


	public String getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(String policy_id) {
		this.policy_id = policy_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
	public String getStatus() {
		return status;
	}

	
	public void setStatus(String status) {
		this.status = status;
	}

	
	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	
	

}
