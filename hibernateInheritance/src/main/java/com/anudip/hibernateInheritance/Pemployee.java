package com.anudip.hibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularemployee")
public class Pemployee extends Employee{

	private int salary;
	private int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public Pemployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
