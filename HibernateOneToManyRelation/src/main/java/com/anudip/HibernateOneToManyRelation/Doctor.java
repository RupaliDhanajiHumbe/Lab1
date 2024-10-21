package com.anudip.HibernateOneToManyRelation;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="saldoctorinfo")
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int dId;
	private String dName;
	private String speciality;
	private String qualifaction;

	@OneToMany(cascade=CascadeType.ALL,mappedBy="doctor")
	List<Appointment> appointments;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public String getQualifaction() {
		return qualifaction;
	}

	public void setQualifaction(String qualifaction) {
		this.qualifaction = qualifaction;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
