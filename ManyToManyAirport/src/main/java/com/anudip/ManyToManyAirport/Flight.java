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
@Table(name="Indigoflight")
public class Flight {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int flightId;
	private String flightName;
	private String flighttroute;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="flights")
	List<Passanger> passangers;
	
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	public String getFlighttroute() {
		return flighttroute;
	}
	public void setFlighttroute(String flighttroute) {
		this.flighttroute = flighttroute;
	}
	
	public List<Passanger> getPassangers() {
		return passangers;
	}
	public void setPassangers(List<Passanger> passangers) {
		this.passangers = passangers;
	}
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
