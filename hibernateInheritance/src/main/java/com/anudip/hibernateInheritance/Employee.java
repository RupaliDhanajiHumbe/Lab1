package com.anudip.hibernateInheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee123")
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Inheritance(strategy=InheritanceType.JOINED)          //it's create separate table


@DiscriminatorValue(value="employee")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
