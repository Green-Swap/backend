package com.greenswap.greenswap.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.greenswap.greenswap.model.Plant;


@Entity
@Table(name = "Type")
public class Type {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@ManyToMany(mappedBy = "types") 
	private List<Plant> plant;


	public Type() {
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


	public List<Plant> getPlant() {
		return plant;
	}


	public void setPlant(List<Plant> plant) {
		this.plant = plant;
	}
	
}
