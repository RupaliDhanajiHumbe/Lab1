package com.anudip.hibernateCRUD;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ebookstore")
public class Book {

	@Id
	private int bid;
	private String bname;
	private int bprice;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getBprice() {
		return bprice;
	}
	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
