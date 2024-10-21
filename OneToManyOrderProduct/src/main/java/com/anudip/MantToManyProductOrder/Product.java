package com.anudip.OneToManyOrderProduct;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name)
public class Product {

	@Id
	private int pId;
	private String pName;
	private int pPrice;
	private int pQuantity;
	
}
