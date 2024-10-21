package com.anudip.ManyToManyAirport;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="indigopassanger")
public class Passanger {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pid;
	private String pname;
	private String pemail;
	
	@ManyToMany(cascade=CascadeType.ALL)
	List<Flight> flights;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPemail() {
		return pemail;
	}
	public void setPemail(String pemail) {
		this.pemail = pemail;
	}
	
	public List<Flight> getFlights() {
		return flights;
	}
	public void setFlights(List<Flight> flights) {
		this.flights = flights;
	}
	public Passanger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
