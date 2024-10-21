package com.anudip.OneToManyProductOrder;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="productcustomer")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private int pPrice;
	private int PQuantity;
	
	@ManyToOne(cascade=CascadeType.ALL)
	OrderItem orderItem;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getPQuantity() {
		return PQuantity;
	}
	public void setPQuantity(int pQuantity) {
		PQuantity = pQuantity;
	}
	public OrderItem getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(OrderItem orderItem) {
		this.orderItem = orderItem;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
