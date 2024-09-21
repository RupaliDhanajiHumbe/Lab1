package com.anudip.HibernateOneToOneRelation;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class AStudent {

	@Id
	private int id;
	private String name;
	private String contact;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressid")
	Address address1;

	
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Address getAddress1() {
		return address1;
	}
	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	public AStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
