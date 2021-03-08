package com.inheritance.single_table;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="SavingAccount")
public class SavingAccount extends Account {
	private double interestRate;

	public SavingAccount(String name, double balance, double interestRate) {
		super(name, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public SavingAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public String toString() {
		
		return "SavingAccount [interestRate=" + interestRate+ "]";
	}


	
}
