package com.greenswap.greenswap.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.greenswap.greenswap.model.Plants;


@Entity
@Table(name = "Categories")
public class Categories {
	@Id
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@ManyToMany(mappedBy = "categories") 
	private List<Plants> plant;


	public Categories() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Plants> getPlant() {
		return plant;
	}


	public void setPlant(List<Plants> plant) {
		this.plant = plant;
	}
	
}
