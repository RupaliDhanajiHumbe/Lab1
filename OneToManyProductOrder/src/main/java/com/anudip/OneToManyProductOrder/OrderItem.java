package com.anudip.OneToManyProductOrder;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ordercustomer")
public class OrderItem {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int orderId;
	private int totalPrice;
	private int orderQuantity;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="orderItem")
	List<Product> product;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
}
