package com.anudip.hibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("contractemployee")
public class Cemployee extends Employee{
	
	private int perHour;
	private int totalHour;
	
	public int getPerHour() {
		return perHour;
	}
	public void setPerHour(int perHour) {
		this.perHour = perHour;
	}
	public int getTotalHour() {
		return totalHour;
	}
	public void setTotalHour(int totalHour) {
		this.totalHour = totalHour;
	}
	public Cemployee() {
		super();
		// TODO Auto-generated constructor stub
	}

}
