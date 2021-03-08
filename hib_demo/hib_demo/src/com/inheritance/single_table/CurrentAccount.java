package com.inheritance.single_table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CurrentAccount")
public class CurrentAccount extends Account {
	private double overDraft;

	public CurrentAccount(String name, double balance, double overDraft) {
		super(name, balance);
		this.overDraft = overDraft;
	}

	public CurrentAccount() {
		
	}

	public double getOverDraft() {
		return overDraft;
	}

	public void setOverDraft(double overDraft) {
		this.overDraft = overDraft;
	}

	@Override
	public String toString() {
		return "CurrentAccount [overDraft=" + overDraft + "]";
	}
	
	
}
