package com.greenswap.greenswap.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Swaps")
public class Swaps {
	@Id
	private long id;
 
	@Column(name = "date", nullable = false)
	private Date date;
	
	@ManyToOne(targetEntity=Plants.class)
	private Plants plant;
	
	@ManyToOne(targetEntity=Plants.class)
	private Plants plantBis;

	public Swaps() {
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

	public Plants getPlant() {
		return plant;
	}

	public void setPlant(Plants plant) {
		this.plant = plant;
	}

	public Plants getPlantBis() {
		return plantBis;
	}

	public void setPlantBis(Plants plantBis) {
		this.plantBis = plantBis;
	}
	
}
