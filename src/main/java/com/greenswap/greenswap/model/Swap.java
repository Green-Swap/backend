package com.greenswap.greenswap.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Swap")
public class Swap {
	@Id
	@GeneratedValue
	private long id;
 
	@Column(name = "date", nullable = false)
	private Date date;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@ManyToOne(targetEntity=Plant.class)
	private Plant plant;
	
	@ManyToOne(targetEntity=Plant.class)
	private Plant plantBis;

	public Swap() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Plant getPlant() {
		return plant;
	}

	public void setPlant(Plant plant) {
		this.plant = plant;
	}

	public Plant getPlantBis() {
		return plantBis;
	}

	public void setPlantBis(Plant plantBis) {
		this.plantBis = plantBis;
	}
}
